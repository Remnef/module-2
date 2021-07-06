package Resizeable;

public class Square extends Shape{
    private float side = 1.0f;


    public Square(){

    }

    public Square(float side) {
        this.side = side;
    }

    public Square(String color, boolean filled, float side) {
        super(color, filled);
        this.side = side;
    }

    @Override
    double getArea() {
        return side*side;
    }

    @Override
    double getPerimeter() {
        return side*4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side= " + side +
                "Area= "+getArea()+
                "Perimeter= "+getPerimeter()+
                '}';
    }

    @Override
    public void resize(double percent) {
        this.side+=(percent*side)/100;
    }
}
