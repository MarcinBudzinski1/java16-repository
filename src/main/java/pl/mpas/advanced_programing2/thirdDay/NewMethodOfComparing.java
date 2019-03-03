package pl.mpas.advanced_programing2.thirdDay;

public class NewMethodOfComparing {

    public int orderOfSorting(Car first, Car second) {

        int result = 0;


        int a = first.getBrand().compareTo(second.getBrand());

        if (0 == a) {
            a = first.getModel().compareTo(second.getModel());

        }

        return a;
    }


}
