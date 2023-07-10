package inheritance.hotel;

public class LuxuryHotel extends Hotel{
    private String rating;

    public LuxuryHotel(String name, int capacity, String rating) {
        super(name, capacity);
        this.rating = rating;
    }

    public void welcomeGuest() {
        System.out.println("Welcome to our luxury hotel "  + ". Enjoy your stay!");
    }
}
