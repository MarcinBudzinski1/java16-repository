package pl.mpas.advanced_programing2.abstract_class;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void eat() {

    }

    @Override
    public void play() {

    }
}
