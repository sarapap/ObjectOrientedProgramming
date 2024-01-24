package Module2;

import java.util.HashMap;
import java.util.Map;

public class QuantityTracking {
    private Map<String, Double> groceryList = new HashMap<>();
    private Map<String, String> categories = new HashMap<>();
    private Map<String, Integer> quantities = new HashMap<>();

    // Add methods here
   /* public void addItem(String item) {
        groceryList.add(item);
    }*/

   /* public void addItemWithCategory(String item, double cost, String category) {
        groceryList.put(item, cost);
        categories.put(item, category);
    }*/

    public void addItemWithQuantity(String item, double cost, String category, int newQuantity) {
        groceryList.put(item, cost);
        categories.put(item, category);
        quantities.put(item, newQuantity);
    }

    public void removeItem(String item) {
        groceryList.remove(item);
        categories.remove(item);
    }

    public void displayList() {
        System.out.println("\nGrocery List: ");
        for (Map.Entry<String, Double> groceryItem : groceryList.entrySet()) {
            String item = groceryItem.getKey();
            String category = categories.get(item);
            int quantity = quantities.getOrDefault(item, 0);
            System.out.println("Category: " + category + " = " + item + " " + groceryItem.getValue() + "€, " +
                    "Quantity: "+ quantity);
        }
    }

    /*public void displayByCategory(String category) {
        System.out.println("\nItems in category: \"" + category + "\":");
        for (Map.Entry<String, Double> groceryItem : groceryList.entrySet()) {
            String item = groceryItem.getKey();
            String itemCategory = categories.get(item);
            if (itemCategory.equals(category)) {
                System.out.println("- " + item);
            }
        }
    }*/

    public void updateQuantity(String item, int newQuantity) {
        if (quantities.containsKey(item)) {
            quantities.put(item, newQuantity);
        }
    }

    public void displayAvailableItems() {
        System.out.println("\nAvailability: "  );
        for (Map.Entry<String, Double> groceryItem : groceryList.entrySet()) {
            String item = groceryItem.getKey();
            int itemQuantity = quantities.getOrDefault(item, 0);
            if (itemQuantity > 0) {
                System.out.println("Items available: " + item + " = " + itemQuantity);
            }
        }

    }

    public void updatedList() {
        System.out.println("\nUpdated Grocery List: ");
        for (Map.Entry<String, Double> groceryItem : groceryList.entrySet()) {
            String item = groceryItem.getKey();
            String category = categories.get(item);
            System.out.println("Category: " + category + " = " + item + " " + groceryItem.getValue() + "€");
        }
    }

    public boolean checkItem(String item) {
        return groceryList.containsKey(item);
    }

    public static void main(String[] args) {
        QuantityTracking groceryList = new QuantityTracking();


        groceryList.addItemWithQuantity("Apples", 2.7, "Fruits", 4);
        groceryList.addItemWithQuantity("Bananas", 2.5, "Fruits", 7);
        groceryList.addItemWithQuantity("Milk", 1.2,"Dairy", 0);
        groceryList.addItemWithQuantity("Yoghurt",2.2, "Dairy", 2);
        groceryList.addItemWithQuantity("Cheese",6.4 ,"Dairy", 1);
        groceryList.addItemWithQuantity("Bread", 3.1,"Bakery", 2);
        groceryList.displayList();

        groceryList.updateQuantity("Bananas", 6);
        groceryList.displayList(); //Check bananas new quantity

        String item = "Apples";
        System.out.println("\nIs \"" + item + "\" in the grocery list? " + groceryList.checkItem(item));

        groceryList.removeItem(item);
        System.out.println("\nRemoving \"" + item + "\" from the list..." );

        groceryList.updatedList();
        groceryList.displayAvailableItems();

    }
}

