package Encapsulation.competition.phoneshop;

public class Smartphone extends Device{
    private int year;
    private double price;
    private int simCards;

    public Smartphone(String model, int year, double price, int simCards) {
        super(model);
        this.year = year;
        this.price = price;
        this.simCards = simCards;
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

    public int getSimCards() {
        return simCards;
    }

    public void setSimCards(int simCards) {
        this.simCards = simCards;
    }

    @Override
    public String getDeviceType() {
        return "Smartphone";
    }
}
