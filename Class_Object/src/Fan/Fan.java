package Fan;

public class Fan {
    static final int Slow = 1;
    static final int MEDIUM = 2;
    static final int FAST = 3;
    private int speed = Slow;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan(){};

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public boolean getStatus(){
        return on;
    }
    public void setStatus(boolean on){
        this.on = on;
    }
    @Override
    public String toString(){
        return "This Fan has radius : "+radius
                +"\nStatus "+on
                +"\nColor: "+color
                +"\nSpeed: "+speed;
    }
}
