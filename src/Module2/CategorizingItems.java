package Module2;

import java.util.HashMap;
import java.util.Map;

public class CategorizingItems {
    private Map<String, Double> groceryList = new HashMap<>();
    private Map<String, String> categories = new HashMap<>();

    // Add methods here
   /* public void addItem(String item) {
        groceryList.add(item);
    }*/

    public void addItemWithCategory(String item, double cost, String category) {
    groceryList.put(item, cost);
    categories.put(item, category);
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
            System.out.println("Category: " + category + " = " + item + " " + groceryItem.getValue() + "€");
        }
    }

    public void displayByCategory(String category) {
        System.out.println("\nItems in category: \"" + category + "\":");
        for (Map.Entry<String, Double> groceryItem : groceryList.entrySet()) {
            String item = groceryItem.getKey();
            String itemCategory = categories.get(item);
            if (itemCategory.equals(category)) {
                System.out.println("- " + item);
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
        CategorizingItems groceryList = new CategorizingItems();


        groceryList.addItemWithCategory("Apples", 2.7, "Fruits");
        groceryList.addItemWithCategory("Bananas", 2.5, "Fruits");
        groceryList.addItemWithCategory("Strawberries", 4.5,"Fruits");
        groceryList.addItemWithCategory("Milk", 1.2,"Dairy");
        groceryList.addItemWithCategory("Yoghurt",2.2, "Dairy");
        groceryList.addItemWithCategory("Cheese",6.4 ,"Dairy");
        groceryList.addItemWithCategory("Bread", 3.1,"Bakery");
        groceryList.displayList();

        String item = "Apples";
        System.out.println("\nIs \"" + item + "\" in the grocery list? " + groceryList.checkItem(item));

        groceryList.removeItem(item);
        System.out.println("\nRemoving \"" + item + "\" from the list..." );

        groceryList.updatedList();
        groceryList.displayByCategory("Fruits");
        groceryList.displayByCategory("Dairy");
    }
}
