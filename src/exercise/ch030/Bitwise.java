package src.exercise.ch030;

public class Bitwise {
    public static void main(String[] args) {
        int a = 60;   // 60 = 0011 1100
        int b = 13;   // 13 = 0000 1101
        System.out.println("a & b = " + (a & b));  // a & b = 12 (0000 1100)
        System.out.println("a | b = " + (a | b));  // a | b = 61 (0011 1101)
        System.out.println("a ^ b = " + (a ^ b));  // a ^ b = 49 (0011 0001)
        System.out.println("~a = " + ~a);          // ~a = -61 (1100 0011)
    }
}
