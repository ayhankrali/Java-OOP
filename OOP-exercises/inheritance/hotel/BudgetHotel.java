package inheritance.hotel;

public class BudgetHotel extends Hotel{
    private double pricePerNight;

    public BudgetHotel(String name, int capacity, double pricePerNight) {
        super(name, capacity);
        this.pricePerNight = pricePerNight;
    }

    public double calculateBill(int numOfNights) {
        return pricePerNight * numOfNights;
    }
}
