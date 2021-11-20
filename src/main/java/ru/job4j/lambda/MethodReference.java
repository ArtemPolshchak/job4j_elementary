package ru.job4j.lambda;

import java.util.function.Consumer;
/**
 * @author User on 10.10.2021.
 * @project job4j_elementary_1
 */
public class MethodReference {

    public void applyByInstance() {
        Consumer<String> consumer = new MethodReference()::consumerByInstance;
        consumer.accept("Hello");
    }

    public static void applyByClass() {
        Consumer<String> consumer =  MethodReference::consumerByClass;
        consumer.accept("Hello");
    }

    private void consumerByInstance(String input) {
        System.out.print("From instance: " + input);
    }

    private static void consumerByClass(String input) {
        System.out.print("From class: " + input);
    }
}
