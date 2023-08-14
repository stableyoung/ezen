package src.ch090;

public class SuperInheritance {
    public static void main(String[] args) {
        Child myChild = new Child("영수", "독서");
        myChild.display();
    }
}

class Parent {
    String name;

    Parent(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("이름: " + name);
    }
}

class Child extends Parent {
    String hobby;

    Child(String name, String hobby) {
        super(name);  // 부모 클래스의 생성자 호출
        this.hobby = hobby;
    }

    @Override
    void display() {
        super.display();  // 부모 클래스의 메소드 호출
        System.out.println("취미: " + hobby);
    }
}

