package src.ch030;

public class Main {
    public static void main(String[] args) {
        int num1 = 400;
        int num2 = 100;

        int sum = num1 + num2;
        System.out.println("Sum: " + sum);

        int difference = num1 - num2;
        System.out.println("Difference: " + difference);

        int product = num1 * num2;
        System.out.println("Product: " + product);

        int quotient = num1 / num2;
//        double quotient = (double) num1 / num2;
        System.out.println("Quotient: " + quotient);

        int remainder = num1 % num2;
        System.out.println("Remainder: " + remainder);
    }
}
