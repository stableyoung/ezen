package src.exercise.ch120;

import java.util.Scanner;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int number = Integer.parseInt(input.nextLine());
            System.out.println("The number entered is " + number);
        } catch (NumberFormatException ex) {
            System.out.println("Incorrect input");
        } finally {
            input.close();
        }
    }
}
