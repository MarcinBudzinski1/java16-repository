package pl.mpas.advanced_programing2.thirdDay.ref_method;

import pl.mpas.advanced_programing2.thirdDay.Car;

public class CompareByBrand {

    public int orderByBrand(Car first, Car second){

        return first.getBrand().compareTo(second.getBrand());
    }
}
