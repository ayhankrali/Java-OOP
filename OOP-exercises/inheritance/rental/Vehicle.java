package inheritance.rental;

abstract public class Vehicle {
    protected String brand;
    protected String model;
    protected int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public abstract void displayInfo();

    public void startEngine() {
        System.out.println("Starting the engine of the " + brand + " " + model);
    }

    public void stopEngine() {
        System.out.println("Stopping the engine of the " + brand + " " + model);
    }
}
