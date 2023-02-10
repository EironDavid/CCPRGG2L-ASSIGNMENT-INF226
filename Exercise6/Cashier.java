public class Cashier {
    
    public void checkOut(GroceryItem item) {
        System.out.println("You have purchased " + item.name);

    }

    public void price(GroceryItem item) {   
        System.out.println(item.name + " Price is " + item.price);

    }

}
