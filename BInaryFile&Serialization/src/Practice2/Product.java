package Practice2;


import java.io.Serializable;

public class Product implements Comparable<Product>, Serializable {
    private int id;
    private String Name;
    private String Producer;
    private int money;

    Product(){}

    public Product(int id, String name, String producer, int money) {
        this.id = id;
        Name = name;
        Producer = producer;
        this.money = money;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getProducer() {
        return Producer;
    }

    public void setProducer(String producer) {
        Producer = producer;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", Producer='" + Producer + '\'' +
                ", money=" + money +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        return this.getName().compareTo(o.getName());
    }
}
