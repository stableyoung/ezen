package src.exercise.ch080;

public class MainRectangle {
    public static void main(String[] args) {
        Rectangle square = new Rectangle();
        System.out.println("정사각형1 면적: " + square.getArea());  // 출력: 정사각형 면적: 0

        square = new Rectangle(5);
        System.out.println("정사각형2 면적: " + square.getArea());  // 출력: 정사각형 면적: 25

        square = new Rectangle(10,5);
        System.out.println("직사각형3 면적: " + square.getArea());  // 출력: 직사각형 면적: 50
    }
}

class Rectangle {
    int width;
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
