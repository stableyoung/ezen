package src.ch090;

public class Dog extends Animal {
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
