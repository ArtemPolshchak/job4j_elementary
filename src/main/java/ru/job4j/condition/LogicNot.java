package ru.job4j.condition;

@SuppressWarnings("checkstyle:WhitespaceAround")
public class LogicNot {

    public boolean isEven(int num) {
        return num % 2 == 0;
    }

    public boolean isPositive(int num) {
        return num > 0;
    }

    public boolean notEven(int num) {
        return !isEven(num);
    }

    public boolean notPositive(int num) {
        return !isPositive(num);
    }

    public boolean notEvenAndPositive(int num) {
        return !isPositive(num) && notEven(num);
    }

    public boolean evenPrNotPositive(int num) {
        return isEven(num) || notPositive(num);
    }
}
