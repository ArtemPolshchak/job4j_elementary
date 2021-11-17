package ru.job4j.condition;

public class ArithmeticActions {
    public static String selectAction(int left, int right, int rsl) {
        if (left + right == rsl) {
            return "added";
        } else if (left - right == rsl) {
            return "subtracted";
        } else if (left *  right == rsl) {
            return "multiplied";
        } else if (left / right == rsl) {
            return "divided";
        } else {
            return "none";
        }
    }
}