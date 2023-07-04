package abstraction.shop;

public class Clothing extends Product{
    private String size;
    private String material;

    public Clothing(String name, double price, String size, String material) {
        super(name, price);
        this.size = size;
        this.material = material;
    }

    @Override
    public double calculateShippingCost() {
        return 5.0; // Example shipping cost calculation for clothing
    }

    public String getSize() {
        return size;
    }

    public String getMaterial() {
        return material;
    }
}
