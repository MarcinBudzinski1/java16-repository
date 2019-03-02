package pl.mpas.advanced_programing2.comparing;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Example{

        public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Mariusz", "Pan" , 34),
                new Person("Antoni", "Maan", 28),
                new Person("Ola", "Fronc", 25));
        Collections.sort(persons);
        System.out.println(persons);
        Collections.sort(persons, Comparator.comparing(Person::getSurname).thenComparing(Person::getName));
    }




}
