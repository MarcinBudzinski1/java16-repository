package pl.mpas.advanced_programing2.generic;

import pl.mpas.advanced_programing2.abstract_class.Animal;
import pl.mpas.advanced_programing2.abstract_class.Cat;
import pl.mpas.advanced_programing2.abstract_class.Dog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionsTest {

    public static void main(String[] args) {

        List<Animal> someList = new ArrayList<>();
        someList.add(new Dog("pies"));
        someList.add(new Cat("Kot"));

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Azor"));
        dogs.add(new Dog("Burek"));

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Mruczuś"));
        cats.add(new Cat("Maluch"));

        displayAnimals(dogs);
        displayAnimals(cats);

    }
    public static void displayAnimals(List<? extends Animal> animals){
        for (Animal animal:animals) {
            System.out.println(animal);
        }
    }
    public static void addAnimal(List<? super Animal> animals){
        animals.add(new Dog("faker"));
    }

}

