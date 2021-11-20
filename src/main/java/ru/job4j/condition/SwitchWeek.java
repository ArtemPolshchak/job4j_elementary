package ru.job4j.condition;

public class SwitchWeek {

    public String nameOfDay(int day) {
        String name;
        switch (day) {
            case 1 :
                name = "Понедельник";
                break;
            case 2 :
                name = "Вторник";
                break;
            case 3 :
                name = "Среда";
                break;
            case 4 :
                name = "Четверг";
                break;
            case 5 :
                name = "Пятница";
            case 6 :
                name = "Субота";
                break;
            case 7 :
                name = "Воскресенье";
                break;
            default:
                name = "Ошибка";
                break;
        }
        return name;
    }
}
