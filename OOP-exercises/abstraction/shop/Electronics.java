package abstraction.shop;

public class Electronics extends Product{
    private String brand;
    private int warrantyPeriod;

    public Electronics(String name, double price, String brand, int warrantyPeriod) {
        super(name, price);
        this.brand = brand;
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public double calculateShippingCost() {
        return 10.0; // Example shipping cost calculation for electronics
    }

    public String getBrand() {
        return brand;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }
}
