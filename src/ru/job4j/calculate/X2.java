package ru.job4j.calculate;

public class X2 {
    @SuppressWarnings("checkstyle:WhitespaceAround")
    public static int calc(int a, int b, int c, int x) {
        return a * x * x + b * x + c;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
        int rs1 = X2.calc(a, b, c, x);
        System.out.println(rs1);
    }

}
