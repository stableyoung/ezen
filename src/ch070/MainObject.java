package src.ch070;

public class MainObject {
    public static void main(String[] args) {
        Person person = new Person();   //인스터화하여 person이라는 객체 생성
        person.name = "홍길동";    // 속성을 대입하고
        person.age = 20;
        person.gender = "남성";
        person.introduce(); // 메소드를 호출한다.
    }
}

class Person {
    String name;
    int age;

    String gender; // 성별

    // 속성 추가..

    void introduce() {

        System.out.println("안녕하세요, 제 이름은 "+name+
                "이고, 나이는 "+age+"살 "+gender+"입니다.");
    }
}
