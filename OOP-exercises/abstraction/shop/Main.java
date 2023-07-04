package abstraction.shop;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();

        Electronics tv = new Electronics("Smart TV", 1000.0, "Sony", 2);
        Clothing shirt = new Clothing("T-Shirt", 25.0, "L", "Cotton");

        shop.addProduct(tv);
        shop.addProduct(shirt);

        shop.displayProductDetails();
    }
}
