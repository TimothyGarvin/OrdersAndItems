import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item();
        item1.name = "Italian Sub";
        item1.price = 4.99;
    
        Item item2 = new Item();
        item2.name = "French Roast";
        item2.price = 3.29;
    
        Item item3 = new Item();
        item3.name = "Greek Yogurt";
        item3.price = 2.49;
    
        Item item4 = new Item();
        item4.name = "English Muffin";
        item4.price = 1.29;
    
        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        order1.name = "Chindhuri";

        Order order2 = new Order();
        order2.name = "Jimmy";

        Order order3 = new Order();
        order3.name = "Joey";

        Order order4= new Order();
        order4.name = "Sam";
    
        // Application Simulations
        order2.items.add(item1);
        order2.total += item1.price;

        order3.items.add(item2);
        order3.total += item2.price;

        order4.items.add(item3);
        order4.total += item3.price;

        order1.items.add(item4);
        order1.total += item4.price;

        order1.ready = true;

        order4.items.add(item1);
        order4.items.add(item1);
        order4.total += 2*item1.price;



        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);
    }
}
