package encapsulation.phoneshop;

public class Computer extends Device{
    private int year;
    private String operatingSystem;
    private double price;

    public Computer(String model, int year, String operatingSystem, double price) {
        super(model);
        this.year = year;
        this.operatingSystem = operatingSystem;
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getDeviceType() {
        return "Computer";
    }
}
