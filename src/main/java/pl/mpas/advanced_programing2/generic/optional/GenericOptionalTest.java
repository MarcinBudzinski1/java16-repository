package pl.mpas.advanced_programing2.generic.optional;

import java.util.Optional;
import java.util.function.Predicate;

public class GenericOptionalTest {

    public static void main(String[] args) {

        Optional<String> maybeMyName = Optional.of("Marcin");
        System.out.println(checkIfNameMatch("Marcin", maybeMyName));

        Predicate<CharSequence> charSequencePredicate= new Predicate<CharSequence>() {
            @Override
            public boolean test(CharSequence charSequence) {
                return maybeMyName.equals(charSequence);
            }
        };




    }
    public static boolean checkIfNameMatch(String name, Optional<String> maybeName) {

        return maybeName.filter(s -> s.equals(name)).isPresent();
    }
    }
