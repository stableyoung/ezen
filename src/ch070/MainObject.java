package src.ch070;

public class MainObject {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "홍길동";
        person.age = 20;
        person.introduce();
    }
}

class Person {
    String name;
    int age;

    void introduce() {
        System.out.println("안녕하세요, 제 이름은 "+name+"이고, 나이는 "+age+"살 입니다.");
    }
}
