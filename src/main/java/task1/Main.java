package task1;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.printf("result sum = %.2f \n", calculator.sum(2.5f, 4));
        System.out.printf("result multiply = %.2f \n" ,calculator.multiply(3.4f, 1.2));
        System.out.printf("result divide = %.2f \n" ,calculator.divide(3.4f, 2));
        System.out.printf("result subtract = %.2f \n" ,calculator.subtract(3.4f, 4.2));



   }
}