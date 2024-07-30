package task1;

public class Calculator {

    public  <T extends Number> double sum(T t1, T t2){
        return t1.doubleValue() + t2.doubleValue();

    }

    public  <T extends Number> double multiply(T t1, T t2){
        return t1.doubleValue() *  t2.doubleValue();
    }

    public  <T extends Number> double divide(T t1, T t2){
        if(t2.doubleValue() == 0){
            throw new  ArithmeticException("На ноль делить нельзя! Повторите попытку с другими данными");
        } else {
            return t1.doubleValue() / t2.doubleValue();
        }
    }

    public  <T extends Number> double subtract(T t1, T t2){
        return t1.doubleValue() -  t2.doubleValue();
    }

}
