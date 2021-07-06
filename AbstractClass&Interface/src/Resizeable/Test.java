package Resizeable;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(5.7f);
        shapes[1] = new Square(6.7f);
        Shape.printShape(shapes);

        shapes[0].resize(34);
        shapes[1].resize(56.232);
        Shape.printShape(shapes);


    }
}
