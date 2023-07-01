package inheritance.rental;

public class Car extends Vehicle {
    private int numberOfSeats;

    public Car(String brand, String model, int year, int numberOfSeats) {
        super(brand, model, year);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car: " + brand + " " + model + ", Year: " + year);
        System.out.println("Number of Seats: " + numberOfSeats);
    }

    public void drive() {
        System.out.println("Driving the car");
    }
}
