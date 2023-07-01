package inheritance.rental;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", "Camry", 2022, 5);
        car.displayInfo();
        car.startEngine();
        ((Car) car).drive();
        car.stopEngine();

        System.out.println();

        Vehicle motorbike = new MotorBike("Harley-Davidson", "Street 750", 2021, "Cruiser");
        motorbike.displayInfo();
        motorbike.startEngine();
        ((MotorBike) motorbike).ride();
        motorbike.stopEngine();
    }
}

