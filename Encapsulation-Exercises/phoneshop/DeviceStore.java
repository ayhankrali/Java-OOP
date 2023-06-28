package phoneshop;

public class DeviceStore {
    public static void main(String[] args) {
        Computer computer1 = new Computer("Apple-1", 1976, "System monitor", 600.50);
        Computer computer2 = new Computer("Turbo PC", 1985, "MS-DOS", 795.99);

        Laptop laptop1 = new Laptop("ThinkPad T30", "IBM", 2002, 195.80, "256MB");
        Laptop laptop2 = new Laptop("Vostro 3510", "Dell", 2013, 499.99, "16384MB");

        Smartphone phone1 = new Smartphone("Xiaomi 13 Pro", 2021, 1200.90, 1);
        Smartphone phone2 = new Smartphone("Samsung Galaxy S10", 2019, 400.50, 2);

        Device[] devices = {computer1, computer2, laptop1, laptop2, phone1, phone2};

        for (Device device : devices) {
            System.out.println("The device from model \"" + device.getModel() + "\" is a " + device.getDeviceType() + ".");
        }
    }
}

