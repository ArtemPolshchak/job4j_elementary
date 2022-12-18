package ru.job4j.parsing;

/**
 * @author Artem Polshchak on 25.12.2021.
 * @project xml parsing
 */
public class People {
    private String name;
    private int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "People{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}
