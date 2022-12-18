package ru.job4j.parsing;

import java.util.List;

/**
 * @author Artem Polshchak on 25.12.2021.
 * @project xml parsing
 */
public class Root {
    private String name;
    private List<People> people;

    public void setName(String name) {
        this.name = name;
    }

    public void setPeople(List<People> people) {
        this.people = people;
    }

    public String getName() {
        return name;
    }

    public List<People> getPeople() {
        return people;
    }

    @Override
    public String toString() {
        return "Root{" + "name='" + name + '\'' + ", people=" + people + '}';
    }
}
