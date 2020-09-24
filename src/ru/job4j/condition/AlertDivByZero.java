package ru.job4j.condition;

public class AlertDivByZero {

    public static void possibleDiv(int number) {
        if (number == 0) {
            System.out.println("Could not div by 0");
        } else if (number < 0) {
            System.out.println("This is negative numbers");
        }
    }

    public static void main(String[] args) {
        possibleDiv(1);
        possibleDiv(0);
        possibleDiv(-5);
    }
}
