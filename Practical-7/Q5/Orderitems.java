package Q5;

public class Orderitems{

    int productId;
    String productName;
    double price;
    int quantity;

    // Constructor
    Orderitems(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Calculate total of one item
    double calculateItemTotal() {
        return price * quantity;
    }

    // Display item details
    void displayItemDetails() {
        System.out.println("Product ID   : " + productId);
        System.out.println("Product Name : " + productName);
        System.out.println("Price        : " + price);
        System.out.println("Quantity     : " + quantity);
        System.out.println("Item Total   : " + calculateItemTotal());
        System.out.println();
    }
}