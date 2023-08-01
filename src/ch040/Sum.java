package src.ch040;

public class Sum {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 0; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
    }
}
