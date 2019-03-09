package pl.mpas.advanced_programing2.abstract_class;

public class Dog  extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {

    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void play() {

    }
}
