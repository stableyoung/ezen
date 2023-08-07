package src.exercise.ch060;

public class Method {
    public static int addNumbers(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
    public static void main(String[] args) {
        int result = Method.addNumbers(10, 20);
        System.out.println("The sum is: " + result);

        Method method = new Method();
        method.displayMessage("Hello! Java");
    }
}
