package ru.job4j.lambda;

import java.util.Optional;

public class OptionalGetAndIsPresent {

    public static int get(int[] data, int el) {
        Optional<Integer> num = indexOf(data, el);
        int result = -1;
        if (num.isPresent()){
            result = num.get();
        }
        return result;
    }

    private static Optional<Integer> indexOf(int[] data, int el) {
        Optional<Integer> opt = Optional.empty();
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                opt = Optional.of(i);
                break;
            }
        }
        return opt;
    }
}
