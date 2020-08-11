import java.util.Comparator;

public class Product implements Comparator<Product> {
    private String name;
    private int id;
    private double money;

    Product(){}

    public Product(int id, String name, double money) {
        this.name = name;
        this.id = id;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", money=" + money +
                '}';
    }

    @Override
    public int compare(Product o1, Product o2) {
        return 0;
    }
}
