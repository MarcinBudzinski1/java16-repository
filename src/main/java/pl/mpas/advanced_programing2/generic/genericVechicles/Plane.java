package pl.mpas.advanced_programing2.generic.genericVechicles;

public class Plane implements Vechicle {

    String name;


    public Plane(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "name='" + name + '\'' +
                '}';
    }
}
