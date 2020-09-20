package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1),2));

        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(5, 6, 8, 12);
        System.out.println("result (5, 6) to (2, 6) " + result);
    }
}