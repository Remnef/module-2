package Circle;

public class Circle {
    double radius = 1;
    String color = "red";

    public Circle()
    {

    }

    public Circle(double r)
    {
        this.radius = r;
    }

    public double getRadius()
    {
        return this.radius;
    }

    public double getArea()
    {
        return 2*this.radius*Math.PI;
    }
}
