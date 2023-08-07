package src.exercise.ch110;

public class Dog extends Animal implements Runnable{
    @Override
    public void run() {
        System.out.println("뛴다.");
    }
    @Override
    void makeSound() {
        System.out.println("멍멍");
    }
}
