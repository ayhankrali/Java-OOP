package inheritance.rental;

public class MotorBike extends Vehicle {

    private String type;

    public MotorBike(String brand, String model, int year, String type) {
        super(brand, model, year);
        this.type = type;
    }

    @Override
    public void displayInfo() {
        System.out.println("Motorbike: " + brand + " " + model + ", Year: " + year);
        System.out.println("Type: " + type);
    }

    public void ride() {
        System.out.println("Riding the motorbike");
    }
}
