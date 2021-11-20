package ru.job4j.array;

public class Initials {
    public static String convert(String[] fio) {

        String[] secondName = fio[1].split("");
        String[] fatherName = fio[2].split("");
        return fio[0] + " " + secondName[0] + "." + fatherName[0] + ".";
    }
}
