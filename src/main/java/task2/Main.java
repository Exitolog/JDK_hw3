package task2;

public class Main {
    public static void main(String[] args) {

        Double[] array1 = new Double[]{1.0, 2.0, 3.0, 4.0};
        Integer[] array2 = new Integer[]{1,2,3,4};

        String[] arrayStr1 = new String[]{"A", "B", "C", "D"};
        String[] arrayStr2 = new String[]{"E", "F", "G", "H"};

        Integer[] intArray1 = new Integer[]{1,2,3,4,5};
        Integer[] intArray2 = new Integer[]{1,2,3,4};

        Double[] doubles1 = new Double[]{1.0, 2.0, 3.0};
        Double[] doubles2 = new Double[]{1.0, 2.0, 3.0};

        SameArray sameArray = new SameArray();

        System.out.println("Если типы данных отличаются: " + sameArray.compareArrays(array1, array2));
        System.out.println("Если типы данных совпадают, но отличаются элементы в массиве: "
                + sameArray.compareArrays(arrayStr1, arrayStr2));
        System.out.println("Если типы данных совпадают, но не совпадает размер массива: "
                + sameArray.compareArrays(intArray1, intArray2) );
        System.out.println("Если все совпадает: " + sameArray.compareArrays(doubles1,doubles2));
    }
}
