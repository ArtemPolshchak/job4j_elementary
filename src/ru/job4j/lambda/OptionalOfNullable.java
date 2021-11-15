package ru.job4j.lambda;

import java.util.List;
import java.util.Optional;

public class OptionalOfNullable {
    public static Optional<String> findValue(List<String> strings, String value) {
        Optional<String> optional = Optional.ofNullable(value);
        for (String string : strings) {
            if (optional.equals(string)) {
                return optional;
            }
        }
       return optional;
    }
}
