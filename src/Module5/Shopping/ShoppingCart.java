package Module5.Shopping;

import java.util.HashMap;
public class ShoppingCart {
    public HashMap<String, Double> items = new HashMap<>();
    public void addItem(String item, double v) {
        items.put(item, v);
    }

    public int getItemCount() {
        return items.size();
    }

    public void removeItem(String item) {
        items.remove(item);
    }

    public double calculateTotal() {
        double total = 0;
        for (double price : items.values()) {
            total += price;
        } return total;
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem("Apple", 1.0);
        cart.addItem("Banana", 0.5);
        cart.addItem("Orange", 0.75);

        System.out.println("Total cost of items in the cart: " + cart.calculateTotal() + " €");
        System.out.println("Number of items in the cart: " + cart.getItemCount());

        cart.removeItem("Apple");
        String item = "Apple";
        System.out.println(item + " has been removed from the cart.");
        System.out.println("Updated number of items in the cart: " + cart.getItemCount());
        System.out.println("Updated total cost of items in the cart: " + cart.calculateTotal() + " €");

    }
}
