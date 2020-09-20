package ru.job4j.calculator;

public class ArgMethod {

    public static void hello(String name){
        System.out.println("Hello " + name );
    }

    public static void main(String[] args) {
        String name = "Petr Arsentev";
        int age = 33;

        ArgMethod.hello(name);

    }
}
