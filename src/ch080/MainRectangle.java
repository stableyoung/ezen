package src.ch080;

public class MainRectangle {
    public static void main(String[] args) {
        Rectangle square = new Rectangle();
        System.out.println("정사각형1 면적: " + square.getArea());  // 출력: 정사각형 면적: 0

        square = new Rectangle(5);
        System.out.println("정사각형2 면적: " + square.getArea());  // 출력: 정사각형 면적: 25

        square = new Rectangle(10,5);
        System.out.println("직사각형3 면적: " + square.getArea());  // 출력: 직사각형 면적: 50

        Circle circle = new Circle();
        System.out.println("원1 면적: " + circle.getArea());  // 출력: 원 면적: 0

        circle = new Circle(7);
        System.out.println("원2 면적: " + circle.getArea());  // 출력: 원 면적: 153.93804002589985
    }
}

class Rectangle {

    // 가로
    int width;

    // 세로
    int height;

    // 기본 생성자
    public Rectangle() {
        this.width = 0;
        this.height = 0;
    }

    // 한 가지 속성만 설정하는 생성자
    public Rectangle(int side) {
        this.width = side;
        this.height = side;
    }

    // 두 속성 모두 설정하는 생성자
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }

}

class Circle {

    // 반지름
    int radius;

    // 기본 생성자
    public Circle() {
        this.radius = 0;
    }

    // 한 가지 속성만 설정하는 생성자
    public Circle(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

}