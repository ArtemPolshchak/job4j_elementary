package ru.job4j.condition;

public class LeapYear {

    public static boolean checkYear(int year) {
        if (year % 400 == 0) {
            return  true;
        } else if (year % 4 == 0 & year % 100 != 0) {
            return true;
        } else {
            return false;
        }

    }
}

