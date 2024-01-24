package Module2;

import java.util.ArrayList;

public class GroceryListManager {
    private ArrayList<String> groceryList = new ArrayList<>();

    // Add methods here
    public void addItem(String item) {
            groceryList.add(item);
    }

    public void removeItem(String item) {
        groceryList.remove(item);
    }

    public void displayList() {
        System.out.println("\nGrocery List: ");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }
    public void updatedList() {
        System.out.println("\nUpdated Grocery List: ");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    public boolean checkItem(String item) {
        return groceryList.contains(item);
    }

    public static void main(String[] args) {
        GroceryListManager groceryList = new GroceryListManager();

        groceryList.addItem("apple");
        groceryList.addItem("banana");
        groceryList.addItem("strawberry");
        groceryList.displayList();

        String item = "apple";
        System.out.println("\nIs \"" + item + "\" in the grocery list? " + groceryList.checkItem(item));

        groceryList.removeItem(item);
        System.out.println("\nRemoving \"" + item + "\" from the list..." );

        groceryList.updatedList();
    }

}
