package ru.job4j.lambda;

import java.util.Optional;

public class OptionalIfPresent {

    public static void ifPresent(int[] data) {
        Optional<Integer> optional = max(data);
        optional.ifPresent(integer -> System.out.println("Max: " + integer));

    }

    private static Optional<Integer> max(int[] data) {
        Optional<Integer> optional = Optional.empty();
        int rsl = 0;
        for (int num : data) {
            rsl = Math.max(rsl, num);
        }
        if (rsl > 0) {
            optional = Optional.of(rsl);
        }
        return optional;
    }
}