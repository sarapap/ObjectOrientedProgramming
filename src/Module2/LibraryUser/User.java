package Module2.LibraryUser;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private int age;
    private List<Book> list;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
        this.list = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<Book> getList() {
        return list;
    }

    public void borrowBook(Book book) {
        list.add(book);
    }

    public void returnBook(Book book) {
        list.remove(book);
    }
}
