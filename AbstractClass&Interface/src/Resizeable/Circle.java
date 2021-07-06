package Resizeable;

public class Circle extends Shape {
    private float radius = 1.0f;

    public Circle(){

    }

    public Circle(float radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, float radius) {
        super(color, filled);
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }

    public double getPerimeter(){
        return 2*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius= " + radius +
                "Area= "+getArea()+
                "Perimeter= "+getPerimeter()+
                '}';
    }

    @Override
    public void resize(double percent) {
        this.radius+=percent*radius/100;
    }
}
