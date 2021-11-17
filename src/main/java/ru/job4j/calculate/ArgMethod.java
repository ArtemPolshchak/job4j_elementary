package ru.job4j.calculate;

public class ArgMethod {

    public static void hello(String name) {

        System.out.println("Hello " + name);
     }

    public static void main(String[] args) {
        String name = "Petr Arsentev";
        int age = 33;

        ArgMethod.hello(name);

    }
}
