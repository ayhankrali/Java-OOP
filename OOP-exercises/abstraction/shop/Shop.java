package abstraction.shop;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Product> products;

    public Shop() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayProductDetails() {
        for (Product product : products) {
            System.out.println("Product: " + product.getName());
            System.out.println("Price: $" + product.getPrice());
            System.out.println("Shipping Cost: $" + product.calculateShippingCost());
            System.out.println();
        }
    }
}
