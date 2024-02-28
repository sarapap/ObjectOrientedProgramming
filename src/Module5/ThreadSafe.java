package Module5;

import java.util.ArrayList;

public class ThreadSafe {
    private ArrayList<String> elements = new ArrayList<>();
    
    public void addItem(String item) {
        elements.add(item);
    }

    public void removeItem(String item) {
        elements.remove(item);
    }

    public int getSize() {
        return elements.size();
    }

    public static void main(String[] args) {
        ThreadSafe threadSafe = new ThreadSafe();
        threadSafe.addItem("apple");
        threadSafe.addItem("banana");
        threadSafe.addItem("strawberry");
        System.out.println("Size of the collection: " + threadSafe.getSize());
        threadSafe.removeItem("apple");
        System.out.println("New size of the collection: " + threadSafe.getSize());
    }
}
