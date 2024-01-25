package Module2.ShoppingList;

import java.util.HashMap;
import java.util.Map;

public class GroceryListManager {
    private Map<String, ShoppingList> lists = new HashMap<>();

    // Add methods here

    public void createList(String purpose) {
        ShoppingList newList = new ShoppingList(purpose);
        lists.put(purpose, newList);
    }

    public void addItem(String purpose, String item, int quantity) {
        ShoppingList shoppingList = lists.get(purpose);
        shoppingList.addItem(item, quantity);
    }

    public void removeItem(String purpose, String item) {
        ShoppingList shoppingList = lists.get(purpose);
        shoppingList.removeItem(item);
    }

    public void displayList(String purpose) {
        ShoppingList shoppingList = lists.get(purpose);
        shoppingList.displayList();
        }


    public static void main(String[] args) {
        GroceryListManager groceryList = new GroceryListManager();


        groceryList.createList("Weekend Camping");
        groceryList.addItem("Weekend Camping", "Biscuits", 4);
        groceryList.addItem("Weekend Camping","Coca Cola", 2);
        groceryList.createList("Backyard BBQ");
        groceryList.addItem("Backyard BBQ", "Chicken", 1);
        groceryList.addItem("Backyard BBQ", "Hamburgers", 10);
        groceryList.displayList("Weekend Camping");
        groceryList.displayList("Backyard BBQ");
        groceryList.removeItem("Weekend Camping", "Biscuits");
        groceryList.displayList("Weekend Camping");

    } }

