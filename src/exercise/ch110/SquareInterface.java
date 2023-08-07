package src.exercise.ch110;

public class SquareInterface {
    public static void main(String[] args) {
        Square square = new Square(10);
        System.out.println("사각형의 면적: " + square.area());
        square.draw();
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

    Square(double side) {
        this.side = side;
    }

    @Override
    double area() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("사각형을 그립니다.");
    }
}