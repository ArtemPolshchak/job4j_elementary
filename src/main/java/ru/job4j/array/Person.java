package ru.job4j.array;

import java.util.ArrayList;

public class Person {
    private String name;
    private String surname;
    private String phone;
    private String address;

    public Person(String name, String surname, String phone, String address) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.address  = address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        Person person = new Person("artem", "polschak", "23232", "32342");

        persons.add(person);

        String test = person.getAddress() + " " + person.getName();
        System.out.println(test);
        if (person.getName().contains("a4r")) {
            System.out.println("ohoho");
        } else {
            System.out.println("fuck Off");
        }
        String s = persons.toString();
        System.out.println(s);

    }

}
