package src.ch110;

public class MainInterface {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.run();
        myDog.makeSound();

        Human myHuman = new Human();
        myHuman.run();
        myHuman.makeSound();
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

class Human extends Animal implements Runnable{
    @Override
    public void run() {
        System.out.println("달린다.");
    }
    @Override
    void makeSound() {
        System.out.println("말한다.");
    }
}
