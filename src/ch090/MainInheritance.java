package src.ch090;

public class MainInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog("뽀삐", 2, "푸들");
        dog.eat();
        dog.sleep();
        dog.bark();
        dog.getAge();
        dog.getBreed();
    }
}

class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(name+"이(가) 먹는다.");
    }

    public void sleep() {
        System.out.println(name+"이(가) 잔다.");
    }

    public void getAge() {
        System.out.println(name+"의 나이는 "+age+"살 입니다.");
    }

}

class Dog extends Animal {
    String breed;

    public Dog(String name, int age, String breed)
    {
        super(name, age);
        this.breed = breed;
    }

    public void bark() {
        System.out.println(name+"이(가) 짖는다.");
    }

    public void getBreed() {
        System.out.println(name+"의 품종은 "+breed+"입니다.");
    }
}
