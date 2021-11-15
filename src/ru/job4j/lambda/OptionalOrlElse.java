package ru.job4j.lambda;

import java.util.Optional;

public class OptionalOrlElse {
    public static Integer orElse(Optional<Integer> optional) {
        Optional<Integer> optional1 = Optional.of(optional.orElse(-1));

        return optional1.get();
    }
}
