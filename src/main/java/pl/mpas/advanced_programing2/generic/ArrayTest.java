package pl.mpas.advanced_programing2.generic;

import pl.mpas.advanced_programing2.abstract_class.Animal;
import pl.mpas.advanced_programing2.abstract_class.Cat;
import pl.mpas.advanced_programing2.abstract_class.Dog;

public class ArrayTest {

    public static void main(String[] args){

        Animal[] dogs = new Dog[2];
        dogs[0] = new Dog("Azor");
        dogs[1] = new Dog("Dingo");

        Animal[] cats = new Cat[2];
        cats[0] = new Cat("Fifi");
        cats[1] = new Cat("Pi");

        Animal[] animals = dogs;
        Object[] objects = animals;

        displayAnimals(cats);
        displayAnimals(dogs);

        addDog(dogs);
        addDog(cats);

        displayAnimals(dogs);
        displayAnimals(cats);
    }
    public static void displayAnimals(Animal[] animals) {

        for (Animal animal: animals) {
            System.out.println(animal);
        }
    }
    public static void addDog(Animal[] animals) {
        animals[0] = new Dog("big one");
    }

}
