package ru.job4j.condition;

public class DummyBot {

    public static String answer(String question) {
        String rs1 = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            rs1 = "Привет умник.";
        } else if ("Пока.".equals(question)) {
            rs1 = "До скорой встречи.";
        }
        return rs1;
    }

    public static void main(String[] args) {
        String rs1 = DummyBot.answer("Привет, Бот.");
        System.out.println(rs1);
        rs1 = DummyBot.answer("Пока.");
        System.out.println(rs1);
    }
}
