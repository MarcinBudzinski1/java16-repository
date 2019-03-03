package pl.mpas.advanced_programing2.thirdDay;

import java.math.BigDecimal;
import java.util.List;

public class Item {

    private String name;
    private BigDecimal price;
    private List<Ingredients> ingrendients;

    public Item(String name, BigDecimal price, List<Ingredients> ingrendients) {
        this.name = name;
        this.price = price;
        this.ingrendients = ingrendients;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public List<Ingredients> getIngrendients() {
        return ingrendients;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", ingrendients=" + ingrendients +
                '}';
    }
}
