package Q5;

import Q5.Orderitems;

public class Order {

    int orderId;
    String customerName;

    Orderitems[] items;
    int itemCount = 0;

    // Constructor
    Order(int orderId, String customerName) {
        this.orderId = orderId;
        this.customerName = customerName;

        items = new Orderitems[10];
    }

    // Add item
    void addItem(Orderitems item) {

        if (itemCount < items.length) {
            items[itemCount] = item;
            itemCount++;

            System.out.println(item.productName + " added to order.");
        }
    }

    // Remove item
    void removeItem(int productId) {

        for (int i = 0; i < itemCount; i++) {

            if (items[i].productId == productId) {

                System.out.println(items[i].productName + " removed from order.");

                for (int j = i; j < itemCount - 1; j++) {
                    items[j] = items[j + 1];
                }

                items[itemCount - 1] = null;
                itemCount--;

                return;
            }
        }

        System.out.println("Product not found.");
    }

    // Calculate total order amount
    double calculateTotalAmount() {

        double total = 0;

        for (int i = 0; i < itemCount; i++) {
            total = total + items[i].calculateItemTotal();
        }

        return total;
    }

    // Display order details
    void displayOrderDetails() {

        System.out.println("\n===== ORDER DETAILS =====");

        System.out.println("Order ID      : " + orderId);
        System.out.println("Customer Name : " + customerName);

        System.out.println("\n--- Order Items ---");

        for (int i = 0; i < itemCount; i++) {
            items[i].displayItemDetails();
        }

        System.out.println("Total Amount  : " + calculateTotalAmount());
    }
}