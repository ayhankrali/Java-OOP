package abstraction.hotel;

public class Main {
    public static void main(String[] args) {
        HotelRoom standardRoom = new StandardRoom("101", 100.0, 2);
        standardRoom.book();
        standardRoom.displayRoomInfo();

        HotelRoom suiteRoom = new SuiteRoom("201", 200.0, true);
        suiteRoom.book();
        suiteRoom.displayRoomInfo();

    }
}
