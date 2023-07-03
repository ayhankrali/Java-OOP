package abstraction.hotel;

public class StandardRoom extends HotelRoom {

    private int capacity;

    public StandardRoom(String roomNumber, double price, int capacity) {
        super(roomNumber, price);
        this.capacity = capacity;
    }

    @Override
    public void book() {
        System.out.println("Standard Room " + getRoomNumber() + " has been booked.");
    }

    @Override
    public void checkOut() {
        System.out.println("Checked out of Standard Room " + getRoomNumber() + ".");
    }

    public int getCapacity() {
        return capacity;
    }

}
