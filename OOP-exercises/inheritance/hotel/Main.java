package inheritance.hotel;

public class Main {
    public static void main(String[] args) {
        LuxuryHotel luxuryHotel = new LuxuryHotel("Grand Luxury Hotel", 100, "5-star");
        luxuryHotel.welcomeGuest();
        luxuryHotel.checkIn();
        luxuryHotel.checkOut();

        BudgetHotel budgetHotel = new BudgetHotel("Affordable Stay Hotel", 50, 50.0);
        budgetHotel.checkIn();
        budgetHotel.checkOut();
        double bill = budgetHotel.calculateBill(3);
        System.out.println("Total bill: $" + bill);
    }
}
