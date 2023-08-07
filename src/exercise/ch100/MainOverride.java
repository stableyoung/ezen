package src.exercise.ch100;

public class MainOverride {
    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        System.out.println(fruit.getColor());

        fruit = new Apple();
        System.out.println(fruit.getColor());

        fruit = new Banana();
        System.out.println(fruit.getColor());
    }
}

class Fruit {
    String getColor() {
        return "색깔이 없습니다.";
    }
}

class Apple extends Fruit{
    @Override
    String getColor() {
        return "빨간색";
    }
}

class Banana extends Fruit{
    @Override
    String getColor() {
        return "노란색";
    }
}
