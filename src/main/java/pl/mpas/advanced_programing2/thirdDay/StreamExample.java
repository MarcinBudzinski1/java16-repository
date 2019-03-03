package pl.mpas.advanced_programing2.thirdDay;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {

        //2 X order
        //3-4 x Items
        //3 Ingredients
        List<Item> saturdayItems = Arrays.asList(
                new Item("kino", BigDecimal.valueOf(35.00),
                        Arrays.asList(new Ingredients("receipt"))),
                new Item("chlebek", BigDecimal.valueOf(15.00),
                        Arrays.asList(new Ingredients("sugar"), new Ingredients("H2O"))

                ));
        List<Item> sundayItems = Arrays.asList(
                new Item("książka", BigDecimal.valueOf(45.00),
                        Arrays.asList(new Ingredients("paper"))),
                new Item("kurczak", BigDecimal.valueOf(15.00),
                        Arrays.asList(new Ingredients("proteins"), new Ingredients("fat"))

                ));

        Order saturdayShopping = new Order(saturdayItems);
        Order sundayShopping = new Order(sundayItems);

        getIngredientsNames(Arrays.asList(saturdayShopping, sundayShopping));


    }

    public static List<String> getIngredientsNames(List<Order> orders) {
        return orders.stream()
                .flatMap(order -> order.getMyItems().stream())
                .flatMap(item -> item.getIngrendients().stream())
                .map(ingredients -> ingredients.getName())
                .distinct()
                .collect(Collectors.toList());

    }
    public static List<String> getIngredientsNamesUsingReduce(List<Order> orders) {
        List<String> result = new ArrayList<>();
                return orders.stream()
                .flatMap(order -> order.getMyItems().stream())
                .flatMap(item -> item.getIngrendients().stream())
                .map(ingredients -> ingredients.getName())
                .distinct()
                .reduce(result, (strings, s) -> {strings.add(s);
                    System.out.println(strings);
                return strings;}, (strings1, strings2) -> result);

    }

        public static BigDecimal getExpenses(List<Order> orders) {
        return orders.stream()
                .flatMap(order -> order.getMyItems().stream())
                .map(Item::getPrice)
                .reduce(BigDecimal.ZERO, (bigDecimal, bigDecimal2) -> bigDecimal.add(bigDecimal2));


    }
}
