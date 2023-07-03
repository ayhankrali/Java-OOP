package abstraction.hotel;

public class SuiteRoom extends HotelRoom{
    private boolean hasJacuzzi;

    public SuiteRoom(String roomNumber, double price, boolean hasJacuzzi) {
        super(roomNumber, price);
        this.hasJacuzzi = hasJacuzzi;
    }

    @Override
    public void book() {
        System.out.println("Suite Room " + getRoomNumber() + " has been booked.");
    }

    @Override
    public void checkOut() {
        System.out.println("Checked out of Suite Room " + getRoomNumber() + ".");
    }

    public boolean hasJacuzzi() {
        return hasJacuzzi;
    }
}
