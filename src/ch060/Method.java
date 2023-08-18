package src.ch060;

public class Method {
    public static int addNumbers(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }
    // multiplyNumbers()..

    public static long multiplyNumbers(long num1, long num2) {
        long sum = num1 * num2;
        return sum;
    }

    public void displayMessage(String message) {

        System.out.println(message);
    }
    public static void main(String[] args) {
        // static method
        int result = Method.addNumbers(10, 20);
        System.out.println("The sum is: " + result);

        long ret = Method.multiplyNumbers(100000L, 200000L);
        System.out.println("The multiply sum is: " + ret);

        // 인스턴스 method
        Method method = new Method(); // 인스턴스화
        method.displayMessage("Hello! Java");
    }
}
