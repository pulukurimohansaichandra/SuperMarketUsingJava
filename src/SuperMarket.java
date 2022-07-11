import java.util.Map.Entry;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class SuperMarket {

    // need a temporary data structure for stock of the items
    // Solution is to create a new two hashmaps
    // HashMap-1 for stock
    // HashMap-1 for price
    // before starting of the super market manager has to update current data stock
    // creating two HashMaps
    HashMap<String, Integer> stock = new HashMap<>();
    HashMap<String, Double> price = new HashMap<>();
    // method to load the stock for every day

    public void loadingStock() {
        Scanner managerInput = new Scanner(System.in);

        // first add the item into the stock and then decide the price for it
        char managerConfirmation = ' ';
        do {
            String itemName;
            int itemStock;
            double itemPrice;
            System.out.println("Enter the Item for Stock");
            itemName = managerInput.nextLine();
            managerInput.nextLine();
            System.out.println("Enter the Item Price ");
            itemPrice = managerInput.nextDouble();
            System.out.println("Enter the item Stock");
            itemStock = managerInput.nextInt();
            stock.put(itemName, itemStock);
            price.put(itemName, itemPrice);
            System.out.println("Do you Want to add the Next Item if Yes Enter 'Y' or 'N'");
            managerConfirmation = managerInput.next().charAt(0);
        } while (managerConfirmation == 'Y' || managerConfirmation == 'y');

    }

    public void displayStock() {
        System.out.println("Diplaying the Current Stock ");
        System.out.println("*----------------------------------*");
        Iterator<Entry<String, Integer>> iterator = stock.entrySet().iterator();

        while (iterator.hasNext()) {
            Entry<String, Integer> item = iterator.next();
            System.out.println("Item Name " + item.getKey() + "-->" + "Item Stock " + item.getValue());
        }

        System.out.println("Displaying the  Current Stock item Price");
        System.out.println("*----------------------------------*");

        Iterator<Entry<String, Double>> priceIterator = price.entrySet().iterator();

        while (iterator.hasNext()) {
            Entry<String, Double> item = priceIterator.next();
            System.out.println("Item Name " + item.getKey() + "-->" + "Item Stock " + item.getValue());
        }

    }

}
