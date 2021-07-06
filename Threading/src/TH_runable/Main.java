package TH_runable;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread tunning..");

        RunnableDemo runnableDemo1 = new RunnableDemo("remnef");
        runnableDemo1.start();

        RunnableDemo r2 = new RunnableDemo("Remneff");
        r2.start();
    }
}

