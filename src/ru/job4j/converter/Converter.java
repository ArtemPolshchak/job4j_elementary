package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        int inEuro = 140;
        int expectedEuro = 2;
        int outEuro = Converter.rubleToEuro(inEuro);
        boolean passedEuro = expectedEuro == outEuro;
        System.out.println("140 rubles are 2, test result "  + passedEuro);

        int inDollar = 120;
        int exeptedDollar = 2;
        int outDollar = Converter.rubleToDollar(inDollar);
        boolean passedDollar = exeptedDollar == outDollar;
        System.out.println("120 rubles are 2, test result " + passedDollar);
    }
}
