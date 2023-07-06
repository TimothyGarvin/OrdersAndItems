import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item("Italian Sub", 4.99);
        Item item2 = new Item("French Roast", 3.29);
        Item item3 = new Item("Greek Yogurt", 2.49);
        Item item4 = new Item("English Muffin", 1.29);

    
        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order("Tim");
        Order order4 = new Order("Jessica");
        Order order5 = new Order("John");

        //Add Items
        order1.addItem(item1);
        order1.addItem(item2);

        order2.addItem(item3);
        order2.addItem(item4);
        order2.setOrderReady(true);

        order3.addItem(item1);
        order3.addItem(item3);

        order4.addItem(item2);
        order4.addItem(item4);

        order5.addItem(item1);
        order5.addItem(item4);
        order5.setOrderReady(true);

        //Test Order Methods
        System.out.println(order2.getStatusMessage());
        System.out.println(order3.getStatusMessage());
        System.out.println(order5.getStatusMessage());

        System.out.println(order1.getOrderTotal());
        order1.display();
    }
}
