package src.ch070;

public class AnimalDemo {
    public static void main(String[] args) {
/*
        // Animal 객체 생성
        Animal cat = new Animal("고양이", 3);

        // 메소드 호출
        cat.makeSound();

        // 이름과 나이 정보 출력
        System.out.println("이름: " + cat.getName());
        System.out.println("나이: " + cat.getAge() + "살");

        // 이름 변경
        cat.setName("나비");
        System.out.println("새로운 이름: " + cat.getName());
*/
        Animal dog = new Animal("강아지", 10);
        dog.makeSound();

        System.out.println("이름: " + dog.getName());
        System.out.println("나이: " + dog.getAge() + "살");

        dog.setName("뽀삐");
        System.out.println("새로운 이름: " + dog.getName());
    }
}

class Animal {
    private String name;
    private int age;

    // 생성자
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 메소드
    public void makeSound() {
        System.out.println(name + "이(가) 소리를 낸다.");
    }

    // getter 와 setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
