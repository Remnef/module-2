package Point_MoveablePoint;

public class MovablePoint extends Point{
    float xSpeed = super.x;
    float ySpeed = super.y;
    public  MovablePoint(){

    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.ySpeed = y;
        this.xSpeed = x;
    }

    public float[] getSpeed(){
        float[] arr= {xSpeed,ySpeed};
        return arr;
    }

    @Override
    public String toString() {
        return "Point= ["+ x +","+y+"]"+
                "\nspeed= ["+ xSpeed +","+ySpeed+"]";
    }

    public MovablePoint move(){
        setX(getX()+getXSpeed());
        setY(getY()+getYSpeed());
        return this;
    }
}
