package abstraction.vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", "Camry", 2021);


        car.start();
        car.accelerate();
        car.brake();
        car.stop();


        Vehicle motorcycle = new Motorcycle("Honda", "CBR500R", 2022);


        motorcycle.start();
        motorcycle.accelerate();
        motorcycle.brake();
        motorcycle.stop();


        Vehicle bicycle = new Bicycle("Giant", "Escape", 2020);


        bicycle.start();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.stop();
    }

}
