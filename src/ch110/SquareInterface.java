package src.ch110;

public class SquareInterface {
    public static void main(String[] args) {
        Square square = new Square(10);
        System.out.println("정사각형의 면적: " + square.area());
        square.draw();

        square = new Square(10, 5);
        System.out.println("직사각형의 면적: " + square.area());
        square.draw();

        Circle circle = new Circle(10);
        System.out.println("원의 면적: " + circle.area());
        circle.draw();
    }
}

interface Drawable {
    void draw();
}

abstract class AbstractShape {
    abstract double area();
}

class Square extends AbstractShape implements Drawable {
    double side;

    double height;

    Square(double side) {
        this.side = side;
        this.height = 0;
    }

    Square(double side, double height) {
        this.side = side;
        this.height = height;
    }

    @Override
    double area() {
        if( height == 0 )
            return side * side;
        else
            return side * height;
    }

    @Override
    public void draw() {
        System.out.println("사각형을 그립니다.");
    }
}

class Circle extends AbstractShape implements Drawable {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("원을 그립니다.");
    }
}