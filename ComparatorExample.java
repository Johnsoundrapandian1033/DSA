package comDSA;
import java.util.*;
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}



class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return Integer.compare(p1.age, p2.age);
    }
}

class NameComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.name.compareTo(p2.name);
    }
}

class AgeNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        int ageComparison = Integer.compare(p1.age, p2.age);
        if (ageComparison != 0) {
            return ageComparison;
        } else {
            return p1.name.compareTo(p2.name);
        }
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 30));

        // Sort by age and then by name
        Collections.sort(people, new AgeNameComparator());
        System.out.println("Sorted by age, then by name: " + people);
    }
}

