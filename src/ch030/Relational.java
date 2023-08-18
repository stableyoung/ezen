package src.ch030;

public class Relational {
    public static void main(String[] args) {
        int a = 20; // ..
        int b = 10; // ..
        System.out.println("a == b = " + (a == b));  // a == b = false
        System.out.println("a != b = " + (a != b));  // a != b = true
        System.out.println("a > b = " + (a > b));    // a > b = true
        System.out.println("a < b = " + (a < b));    // a < b = false
        System.out.println("b >= a = " + (b >= a));  // b >= a = false
        System.out.println("b <= a = " + (b <= a));  // b <= a = true
    }
}
