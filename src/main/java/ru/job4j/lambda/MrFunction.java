package ru.job4j.lambda;

import java.util.function.Function;

public class MrFunction {
    public static Function<Double, Double> apply() {
        return Math::sqrt;
    }
}
