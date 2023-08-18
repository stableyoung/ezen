package src.ch040;

public class Sum {
    public static void main(String[] args) {
        int sum = 0;
        /*
        for(int i = 1; i <= 1000; i++) {
            sum += i;
        }
        */
        // while..
        int i = 1;
        while(i <= 1000) {
            sum += i;
            i++;
        }

        System.out.println("Sum: " + sum);
    }
}
