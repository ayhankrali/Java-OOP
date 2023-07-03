package abstraction.hotel;

abstract class HotelRoom {
    private String roomNumber;
    private double price;

    public HotelRoom(String roomNumber, double price) {
        this.roomNumber = roomNumber;
        this.price = price;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public double getPrice() {
        return price;
    }

    public abstract void book();

    public abstract void checkOut();

    public void displayRoomInfo() {
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Price per night: $" + price);
    }
}
