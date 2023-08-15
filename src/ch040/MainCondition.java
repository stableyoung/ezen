package src.ch040;

import java.util.Scanner;

public class MainCondition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if(number> 0) {
            System.out.println("The number is positive.");
        } else if(number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        switch (number) {
            case 0:
                System.out.println("The number is zero.");
                break;
            case 1:
                System.out.println("The number is one.");
                break;
            default:
                System.out.println("The number is not zero or one.");
                break;
        }
        // 디버그..
    }
}
