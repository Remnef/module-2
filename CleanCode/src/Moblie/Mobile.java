package Moblie;

public class Mobile {
    private String name, color;
    private boolean status;
    private int pin;
    private int m1=0,m2=0;
    private String[] messed= new String[255];
    private String[] messing= new String[255];

    public Mobile() {
    }

    public Mobile(String name, String color, boolean status, int pin) {
        this.name = name;
        this.color = color;
        this.status = status;
        this.pin = pin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void getMess(String mess, Mobile mobile2){
        this.messed[m1] = mess;
        mobile2.messing[mobile2.m2] = mess;
        this.m1++;
        mobile2.m2++;
    }

    public void checkMessed(){
        for (int i =0; i<m1;i++)
            System.out.println(messed[i]);
    }

    public void checkMessing(){
        for (int i =0; i<m2; i++)
            System.out.println(messing[i]);
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "name:'" + name + '\'' +
                ", color:'" + color + '\'' +
                ", status:" + status +
                ", pin:" + pin +
                ", Messeds:" + m1 +
                ", Messings:" + m2 +
                '}';
    }
}
