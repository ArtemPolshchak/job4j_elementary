package ru.job4j.lambda;


import java.util.function.Function;

public class FunctionSqrt {

    public static double calculate(double x) {
        return calculate(t -> Math.sqrt(x), x);
    }

    public static double calculate(Function<Double, Double> y, double x) {
        return y.apply(x);
    }

}
