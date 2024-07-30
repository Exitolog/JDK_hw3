package task3;

public class Main {
    public static void main(String[] args) {
        Pair<String , Integer> pair = new Pair<>("Абвшка", 14);
        System.out.println(pair.toString());
        System.out.println(pair.getFirstArgument());
        System.out.println(pair.getSecondArgument());
    }
}
