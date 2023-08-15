package src.ch070;

public class MainCar {
    public static void main(String[] args) {
       Car myCar = new Car();
         myCar.name = "포르쉐";
         myCar.color = "빨강";

         myCar.speedUp();
         myCar.speedUp();
         myCar.speedDown();

         myCar.print();
         myCar.stop();
         myCar.print();
    }
}

class Car {
    String name;
    String color;
    int speed;

    // displacement 베기량 속성 추가

    void speedUp() {
        speed += 10;
    }

    void speedDown() {
        speed -= 10;
    }

    void stop() {
        speed = 0;
    }

    void print() {
        System.out.println("차종: " + name);
        System.out.println("색상: " + color);
        System.out.println("속도: " + speed);
    }
}