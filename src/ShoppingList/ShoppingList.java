package ShoppingList;

import java.util.HashMap;
import java.util.Map;

public class ShoppingList {
    private String purpose;
    private Map<String, Integer> items;

    public ShoppingList(String purpose) {
        this.purpose = purpose;
        this.items = new HashMap<>();
    }

    public void addItem(String item, int quantity) {
        items.put(item, quantity);
    }

    public void removeItem(String item) {
        items.remove(item);
    }

    public void displayList() {
        System.out.println("\nShopping list for a specific purpose: " + purpose);
        for (Map.Entry<String, Integer> item : items.entrySet()) {
            System.out.println("- " + item.getKey() + ": " + item.getValue());
        }
    }


}
