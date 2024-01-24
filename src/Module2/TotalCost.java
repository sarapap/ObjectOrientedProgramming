package Module2;

import java.util.HashMap;
import java.util.Map;

public class TotalCost {
    private Map<String, Double> groceryList = new HashMap<>();

    // Add methods here
    public void addItem(String item, double cost) {
        groceryList.put(item, cost);
    }

    public void removeItem(String item) {
        groceryList.remove(item);
    }

    public void displayList() {
        System.out.println("\nGrocery List: ");
        for (Map.Entry<String, Double> entry : groceryList.entrySet()) {
            System.out.println((entry.getKey()) + " : € " + entry.getValue());
        }
    }

    public void updatedList() {
        System.out.println("\nUpdated Grocery List: ");
        for (Map.Entry<String, Double> entry : groceryList.entrySet()) {
            System.out.println((entry.getKey()) + " : € " + entry.getValue());
        }
    }

    public boolean checkItem(String item) {
        return groceryList.containsKey(item);
    }

    public double calculateTotalCost() {
        double totalCost = 0;
        for (double cost : groceryList.values()) {
            totalCost += cost;
        } return totalCost;
    }

    public static void main(String[] args) {
        TotalCost groceryList = new TotalCost();

        groceryList.addItem("apples", 2.20);
        groceryList.addItem("banana", 0.50);
        groceryList.addItem("strawberries", 4.20);
        groceryList.displayList();

        System.out.println("\nTotal cost of the grocery list: " + groceryList.calculateTotalCost());

        String item = "apples";
        System.out.println("\nIs \"" + item + "\" in the grocery list? " + groceryList.checkItem(item));

        groceryList.removeItem(item);
        System.out.println("\nRemoving \"" + item + "\" from the list..." );

        groceryList.updatedList();

        System.out.println("\nTotal cost of the grocery list: " + groceryList.calculateTotalCost());
    }
}
