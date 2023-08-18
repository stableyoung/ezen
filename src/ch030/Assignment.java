package src.ch030;

public class Assignment {
    public static void main(String[] args) {
        int a = 20; //..
        int b = 10; //.
        a += b;  // a = a + b = 30
        System.out.println("a = " + a);  // a = 30
        a -= b;  // a = a - b = 10
        System.out.println("a = " + a);  // a = 20
        a *= b;  // a = a * b = 200
        System.out.println("a = " + a);  // a = 200
        a /= b;  // a = a / b = 20
        System.out.println("a = " + a);  // a = 10
    }
}
