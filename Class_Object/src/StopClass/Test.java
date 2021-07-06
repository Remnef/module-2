package StopClass;

public class Test {
    public static void main(String[] args) {
        StopWatch time1 = new StopWatch();
        time1.stop();
        System.out.println(time1.getElapsedTime());
    }
}
