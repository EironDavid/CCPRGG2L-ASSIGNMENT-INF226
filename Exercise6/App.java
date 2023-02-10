public class Exercise6 {
    
    public static void main(String[] args) throws Exception{
        
        //item in diaper
        GroceryItem item1 = new Diaper();
        item1.name = " Propt";
        item1.price = 250;
        item1.showItemName();

        //item in soda
        GroceryItem item2 = new Soda();
        item2.name = " Pepsi Blue";
        item2.price = 35;
        item2.showItemName();

        //Cashier object
        Cashier c1 = new Cashier();

        //polymorphic parameter
        c1.checkOut(item1);
        c1.checkOut(item2);

        c1.price(item1);
        c1.price(item2);

        //polymorphic Array
        GroceryItem[] itemArray = new GroceryItem[2];

        itemArray[0] = item1;
        itemArray[1] = item2;

        double totalAmount = 0.00;
        
        for (int i = 0; i < itemArray.length; i++) {
        
        itemArray[i].showItemName();
        System.out.println(itemArray[i].price);

        totalAmount += itemArray[i].price;

        }
        System.out.println("totalAmount: " + totalAmount);

        //Cat Object
        Dinosaur myDinosaur = new Dinosaur();
        myDinosaur.eat();
    }
}
