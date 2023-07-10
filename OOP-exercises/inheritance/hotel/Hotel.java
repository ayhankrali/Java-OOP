package inheritance.hotel;

public class Hotel {
    private String name;
    private int capacity;

    public Hotel(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public void checkIn() {
        System.out.println("Guest checked in at " + name);
    }

    public void checkOut() {
        System.out.println("Guest checked out from " + name);
    }
}
