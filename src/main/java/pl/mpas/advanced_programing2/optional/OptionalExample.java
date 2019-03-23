package pl.mpas.advanced_programing2.optional;

import java.util.Optional;

public class OptionalExample{

    public static void main(String[] args) {
        doSomething("Ala ma kota");
        doSomething(null);
    }
    public static void doSomething(String isNullOrNot) {
        Optional.ofNullable(isNullOrNot);
        // poniżej nie może być nulla
        // Optional.of(isNullOrNot);
    }

    public static Optional<String> getPersonNick() {
        return Optional.empty();
    }
}
