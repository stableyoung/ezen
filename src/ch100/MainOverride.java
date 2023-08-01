package src.ch100;

public class MainOverride {
    public static void main(String[] args) {
        Fruit fruit = new Apple();
        System.out.println(fruit.getColor());

        fruit = new Banana();
        System.out.println(fruit.getColor());
    }
}
