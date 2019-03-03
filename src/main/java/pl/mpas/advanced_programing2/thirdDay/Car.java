package pl.mpas.advanced_programing2.thirdDay;

import java.time.LocalDate;

public class Car implements Comparable<Car>{

        private float capacity;
        private LocalDate year;
        private String brand;
        private String color;
        private String model;

    @Override
    public String toString() {
        return "Car{" +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", capacity=" + capacity +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}' +'\n';
    }

    Car(float capacity, LocalDate year, String brand, String color, String model) {
        this.capacity = capacity;
        this.year = year;
        this.brand = brand;
        this.color = color;
        this.model = model;
    }

    public float getCapacity() {
        return capacity;
    }

    public LocalDate getYear() {
        return year;
    }

    public String getBrand() {
        return brand;
    }

     public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    @Override
    public int compareTo(Car o) {

        return year.compareTo(o.year);

    }
}
