import java.io.Serializable;

public class Drink implements Serializable {
    private String name;
    private int cost;
    private String type;
    private int amount=0;
    private int bill;
    public Drink(){

    }

    public Drink(String name, int cost, String type) {
        this.name = name;
        this.cost = cost;
        this.type = type;
    }


    public void setBill() {
        this.bill = cost*amount;
    }

    public int getBill() {
        setBill();
        return bill;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type +
                "-[ " + name+
                ",cost: " + cost +
                ", amount: " + amount +
                ", bill: " + bill +
                " ]\n";
    }
}
