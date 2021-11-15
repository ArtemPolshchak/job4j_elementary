package ru.job4j.condition;

public class HelloWorld {
    public static String checkNumber(int number) {
        if (number % 3 == 0 & number % 5 == 0) {
            return "Hello, World!!!";
        }
        if (number % 3 == 0) {
            return "Hello";
        } else if (number % 5 == 0) {
            return "World";

        } else {
            return "Operation not support";
        }
    }
}