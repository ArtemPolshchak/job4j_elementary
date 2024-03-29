package ru.job4j.lambda;

import java.util.List;
import java.util.Optional;

public class OptionalOfAndEmpty {
    public static Optional<String> findValue(List<String> strings, String value) {
        Optional<String> opt = Optional.empty();
        for (String s : strings) {
            if (value.equals(s)) {
                opt = Optional.of(s);
            }
        }
        return opt;
    }
}
