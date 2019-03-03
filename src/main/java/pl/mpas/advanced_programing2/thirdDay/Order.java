package pl.mpas.advanced_programing2.thirdDay;

import java.util.List;

public class Order {

    List<Item> myItems;

    public Order(List<Item> myItems) {
        this.myItems = myItems;
    }

    public List<Item> getMyItems() {
        return myItems;
    }
}
