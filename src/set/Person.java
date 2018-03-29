package set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Person implements Comparable{
    Integer id;
    String name;


    public Person() {
    }

    public Person(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("person(id : %d, name : %s)\n",id,name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public boolean equals(Object obj) {
       Person person = (Person) obj;
       return name.equals(person.name);
    }

    @Override
    public int compareTo(Object o) {
        Person person = (Person) o;

        return id.compareTo(person.id);
    }

    public static void main(String[] args) {
        Set<Person>  persons = new HashSet<>();
        persons.add(new Person(1,"rajiv"));
        persons.add(new Person(3,"raman"));
        persons.add(new Person(2,"mahesh"));
        persons.add(new Person(4,"raman"));

        System.out.println(persons.toString());

    }


}
