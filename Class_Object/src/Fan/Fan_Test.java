package Fan;

public class Fan_Test {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setColor("yellow");
        fan1.setStatus(true);
        fan1.setRadius(10);
        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        fan1.setColor("blue");
        fan1.setStatus(false);
        fan1.setRadius(5);
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
