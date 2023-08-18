package src.ch100;

public class SpeedOverride {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.maxSpeed();

        vehicle = new Car();
        vehicle.maxSpeed();

        vehicle = new Bicycle();
        vehicle.maxSpeed();

        vehicle = new MotorCycle();
        vehicle.maxSpeed();
    }
}

class Vehicle {
    void maxSpeed() {
        System.out.println("기본 최대 속도");
    }
}

class Car extends Vehicle {
    @Override
    void maxSpeed() {
        System.out.println("자동차의 최대 속도: 200km/h");
    }
}

class Bicycle extends Vehicle {
    @Override
    void maxSpeed() {
        System.out.println("자전거의 최대 속도: 30km/h");
    }
}

class MotorCycle extends Vehicle {

    @Override
    void maxSpeed() {
        System.out.println("오토바이의 최대 속도: 150km/h");
    }
}

// MotorCycle 오트바이 클래스 추가..