package Point_MoveablePoint;

public class Test {
    public static void main(String[] args) {
        Point point = new Point();
        point.setX(0);
        point.setY(3);
        System.out.println(point.toString());

        point.setXY(3,8);
        System.out.println(point.toString());

        MovablePoint movablePoint = new MovablePoint();
        movablePoint.setX(point.getX());
        movablePoint.setY(point.getY());

        movablePoint.setXSpeed(3);
        movablePoint.setYSpeed(2);

//        movablePoint.move();

        System.out.println(movablePoint.toString());
    }
}
