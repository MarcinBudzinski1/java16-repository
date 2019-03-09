package pl.mpas.advanced_programing2.generic;

import pl.mpas.advanced_programing2.abstract_class.Cat;
import pl.mpas.advanced_programing2.abstract_class.Dog;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SecretExample {

    public static void main(String[] args) {


    MyStringSecret dream = new MyStringSecret("hahaha");
    MyBigDecimalSecret dreams = new MyBigDecimalSecret(BigDecimal.ZERO);

    MySecretGenericV1 testInteger = new MySecretGenericV1(Integer.valueOf(1));
    Integer secretInteger = (Integer) testInteger.getObject();

    checkMySecret(testInteger);

        List animals = new ArrayList();
    animals.add(new Dog("Cat"));
    animals.add(new Cat("Dog"));

    MySecondGeneric<String> stringSecret = new MySecondGeneric<>("secret");
    MySecondGeneric<BigDecimal> futureIncome = new MySecondGeneric<>(BigDecimal.valueOf(1_000_000));
    MySecondGeneric objectSecet = new MySecondGeneric(new Object());
}
    public static void checkAnimals(List animals) {
        for (Object animal: animals) {
            if (animal instanceof Dog) {
                System.out.println("Pies");
            } else if (animal instanceof Cat) {
                System.out.println("Kot");
            } else {
                System.out.println("Unknown animal");
            }

        }


    }








public static void checkMySecret(MySecretGenericV1 secretGenericV1) {

        if (secretGenericV1.getObject() instanceof Integer) {
            Integer secret = (Integer) secretGenericV1.getObject();
            System.out.println("Secret" + secret);
        }
    }


}
