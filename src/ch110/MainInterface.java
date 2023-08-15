package src.ch110;

public class MainInterface {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.run();
        myDog.makeSound();
    }
}

interface Runnable {
    void run();
}


abstract class Animal {
    abstract void makeSound();
}

class Dog extends Animal implements Runnable{
    @Override
    public void run() {
        System.out.println("뛴다.");
    }
    @Override
    void makeSound() {
        System.out.println("멍멍");
    }
}

// Class Human ..