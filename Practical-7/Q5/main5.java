package Q5;

public class main5 {

           public static void main(String[] args) {


            Order order = new Order(101, "Rahul");


            Orderitems item1 =
                    new Orderitems(1, "Laptop", 50000, 1);

            Orderitems item2 =
                    new Orderitems(2, "Mouse", 500, 2);

            Orderitems item3 =
                    new Orderitems(3, "Keyboard", 1000, 1);

            order.addItem(item1);
            order.addItem(item2);
            order.addItem(item3);


            order.displayOrderDetails();


            System.out.println("\n===== AFTER REMOVING MOUSE =====");

            order.removeItem(2);


            order.displayOrderDetails();
        }
    }

