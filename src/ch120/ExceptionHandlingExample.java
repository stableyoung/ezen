package src.ch120;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class ExceptionHandlingExample {
    public static void main(String[] args) {

        while(true) {
            Scanner input = new Scanner(System.in);
            try {
                System.out.print("Enter an integer: ");
                int number = Integer.parseInt(input.nextLine());
                System.out.println("The number entered is " + number);
            } catch (NumberFormatException ex) {
                System.out.println("Incorrect input");
                System.exit(-1);
            } catch (NoSuchElementException ex) {
                System.out.println("No line found");
                System.exit(-1);
            } finally {
                input.close();
            }
        }
    }
}
