package ru.job4j.lambda;

import java.util.function.Function;

/**
 * @author Artem Polshchak on 08.10.2021.
 * @project job4j_elementary
 * Fuction. Возвести число в квадрат
 */
public class FunctionPow {

    public static double calculate(double x) {
        return calculate(t -> x * x, x);
    }

    private static double calculate(Function<Double, Double> y, double x) {
        return y.apply(x);
    }
}
