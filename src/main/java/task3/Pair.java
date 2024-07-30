package task3;

public class Pair <T1, T2>{

    T1 firstArgument;
    T2 secondArgument;

    public Pair(T1 t1, T2 t2) {
        this.firstArgument = t1;
        this.secondArgument = t2;
    }

    public T1 getFirstArgument() {
        return firstArgument;
    }

    public T2 getSecondArgument() {
        return secondArgument;
    }

    @Override
    public String toString() {
        return "Pair {" +
                "firstArgument = " + firstArgument +
                ", secondArgument = " + secondArgument +
                '}';
    }
}
