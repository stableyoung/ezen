package src.ch040;

import java.util.Scanner;

public class MainLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        for(int i = 0; i <= number; i++) {
            System.out.println(i);
        }

        char input;
        while(true) {
            System.out.println("Enter a character: ");
            input = scanner.next().charAt(0);
            if(input == 'q') {
                break;
            }
        }
    }
}
