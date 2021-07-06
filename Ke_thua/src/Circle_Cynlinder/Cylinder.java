package Circle_Cynlinder;

public class Cylinder extends Circle{
    double height = 1.0;

    public Cylinder(){

    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double height,double radius){
        this.radius = radius;
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return super.getArea()*height;
    }

    @Override
    public String toString() {
        return "Cylinder :" +
                "\nheight= " + height +
                "\nradius= " + radius +
                "\ncolor= " + color +
                "\nArea= "+getArea();
    }
}
