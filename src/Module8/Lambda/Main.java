package Module8.Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("John", 25, "New York"));
        people.add(new Person("Sara", 22, "Helsinki"));
        people.add(new Person("Michael", 40, "Berlin"));
        people.add(new Person("Lisa", 34, "London"));
        people.add(new Person("Mary", 27, "Madrid"));

        people.sort(Comparator.comparingInt(Person::getAge));
        System.out.println("People sorted by age:");
        people.forEach(person -> System.out.println(person));
        System.out.println();


        String city = "Helsinki";
        people.removeIf(person -> !person.getCity().equals(city));
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
