package Rectangle;

public class Rectangle {
    double width, height;
    public Rectangle(){};
    public  Rectangle(double width,double height)
    {
        this.width=width;
        this.height=height;
    }
    public double getArea()
    {
        return (this.width+this.height)*2;
    }
    public double getPerimeter()
    {
        return (this.height*this.width);
    }
    public void display()
    {
        System.out.println("Rectangle: width= "+width+", height= "+height);
        System.out.println("Area: "+this.getArea()+" Perimeter: "+this.getPerimeter());
    }

}
