package src.ch090;

public class Animal {
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
