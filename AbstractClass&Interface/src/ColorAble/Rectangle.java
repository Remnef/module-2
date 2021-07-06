package ColorAble;

public class Rectangle extends Shape {
    private double height = 1.0;
    private double width = 1.0;
    public Rectangle(){};

    public Rectangle(double height, double width)
    {
        this.height=height;
        this.width=width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea(){ return height*width;}

    public double getPerimeter(){ return 2*(width+height);}

    @Override
    public String toString() {
        return "A Rectangle with height= "
                +getHeight()+
                "width= "
                +getWidth()
                +" Area: "+
                getArea()
                +" Perimeter: "
                +getPerimeter();
    }
}
