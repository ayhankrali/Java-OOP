package abstraction.shop;

public abstract class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product() {

    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public abstract double calculateShippingCost();
}
