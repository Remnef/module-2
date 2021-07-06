package DS_sanPham;

import java.io.Serializable;

public class Product implements Serializable {
    private String name;
    private String id;
    private String factory;
    private int cost;

    public Product(){

    }

    public Product(String name, String id, String factory, int cost) {
        this.name = name;
        this.id = id;
        this.factory = factory;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", factory='" + factory + '\'' +
                ", cost=" + cost +
                '}';
    }
}
