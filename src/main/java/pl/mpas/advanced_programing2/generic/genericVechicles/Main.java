package pl.mpas.advanced_programing2.generic.genericVechicles;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMV"));
        cars.add(new Car("Lexus"));

        List<Plane> planes = new ArrayList<>();
        planes.add(new Plane("Airbus"));
        planes.add(new Plane("Falcon"));

        displayVechiles(cars);
        displayVechiles(planes);
        addCar(cars);
    }

    private static void displayVechiles(List<? extends Vechicle> vechicles) {
        for (Vechicle vechicle:vechicles){
            System.out.println(vechicle);
        }

    }
    public static void addCar(List<? super Car> cars){
        cars.add(new Car("new car"));

    }
}
