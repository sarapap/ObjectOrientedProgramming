package Module2;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class CategorizingItems {
    private Map<String, Double> groceryList = new HashMap<>();
    private Map<String, String> categories = new HashMap<>();

    // Add methods here
    public void addItem(String item, double cost) {
        groceryList.put(item, cost);
    }

    public void addItemWithCategory(String item, String category) {
    groceryList.put(item, 0.0);
    categories.put(item, category);
    }

    public void removeItem(String item) {
        groceryList.remove(item);
        categories.remove(item);
    }

    public void displayList() {
        System.out.println("\nGrocery List: ");
        for (Map.Entry<String, Double> entry : groceryList.entrySet()) {
            String item = entry.getKey();
            String category = categories.get(item);
            double cost = entry.getValue();
            System.out.println(item + " (" + category + "): €" + cost);
        }
    }

    public void displayByCategory(String category) {
        System.out.println("Items in category  \"" + category + "\":");
        ArrayList<String> itemsInCategory = new ArrayList<>();
        for (Map.Entry<String, String> entry : categories.entrySet()) {
            String item = entry.getKey();
            String itemCategory = entry.getValue();
            if (itemCategory.equals(category)) {
                itemsInCategory.add(item);
            }
        }
    }


    public void updatedList() {
        System.out.println("\nUpdated Grocery List: ");
        for (Map.Entry<String, Double> entry : groceryList.entrySet()) {
            String item = entry.getKey();
            String category = categories.get(item);
            double cost = entry.getValue();
            System.out.println(item + " (" + category + "): €" + cost);
        }
    }

    public boolean checkItem(String item) {
        return groceryList.containsKey(item);
    }

    public static void main(String[] args) {
        CategorizingItems groceryList = new CategorizingItems();

        groceryList.addItemWithCategory("Apples", "Fruits");
        groceryList.addItemWithCategory("Milk", "Dairy");
        groceryList.addItemWithCategory("Bread", "Bakery");
        groceryList.displayList();

        String item = "apple";
        System.out.println("\nIs \"" + item + "\" in the grocery list? " + groceryList.checkItem(item));

        groceryList.removeItem(item);
        System.out.println("\nRemoving \"" + item + "\" from the list..." );

        groceryList.updatedList();
        groceryList.displayByCategory("Fruits");
    }
}
