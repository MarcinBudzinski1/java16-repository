package pl.mpas.advanced_programing2.thirdDay;

import pl.mpas.advanced_programing2.thirdDay.ref_method.CompareByBrand;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingCars {

    public static void main(String[] args) {

        List<Car> cars = Arrays.asList(
                new Car(2.0f, LocalDate.of(2012, 3, 20), "Fiat", "Red", "Tipo"),
                new Car(1.8f, LocalDate.of(2013, 5, 25), "Nissan", "Blue", "Kashkai"),
                new Car(2.2f, LocalDate.of(2009, 2, 11), "Mercedes", "Yellow", "V202"),
                new Car(2.0f, LocalDate.of(2016, 8,30), "Lexus", "Black", "ES")
        );
        Collections.sort(cars);
        System.out.println(cars);
        cars.sort(Comparator.comparing(Car::getBrand).thenComparing(Car::getModel).thenComparing(Car::getColor));
        System.out.println(cars);

        cars.sort(Comparator.comparing(Car::getColor));
        System.out.println("Befor sorting by color...");
        cars.sort(new CarBrandComparator());
        System.out.println("After sorting by color...");
        System.out.println(cars);


        CompareByBrand anotherBrandComparingWay = new CompareByBrand();
        cars.sort(anotherBrandComparingWay::orderByBrand);

        NewMethodOfComparing newMethodofComparing = new NewMethodOfComparing();
        cars.sort(newMethodofComparing::orderOfSorting);

        cars.sort(Comparator.comparing(Car::getBrand).thenComparing(Car::getModel).thenComparing(Car::getColor).reversed());


    }
}
