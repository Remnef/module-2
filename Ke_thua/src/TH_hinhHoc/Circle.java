package TH_hinhHoc;

public class Circle extends Shape {
    private  double radius = 1.0;

    public Circle(){

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color,boolean filled, double radius){
        super(color,filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return 2*radius*Math.PI;
    }

    public double getPerimetter(){
        return radius*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
