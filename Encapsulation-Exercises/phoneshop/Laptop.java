package phoneshop;

public class Laptop extends Device{
    private String manufacturer;
    private int year;
    private double price;
    private String memory;

    public Laptop(String model, String manufacturer, int year, double price, String memory) {
        super(model);
        this.manufacturer = manufacturer;
        this.year = year;
        this.price = price;
        this.memory = memory;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    @Override
    public String getDeviceType() {
        return "Laptop";
    }
}
