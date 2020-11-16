package ru.job4j.io;

import java.util.Scanner;

public class Matches {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstPlayer = "Artem";
        String secondPlayer = "Tania";
        int count = 1;
        int matches = 11;
        System.out.println("введите число от 1 до 3");
        System.out.println("Игрок " + firstPlayer + " Делает первый ход");
        while (matches > 0) {
            int select = Integer.parseInt(scanner.nextLine());
            String name = count % 2 == 0 ? firstPlayer : secondPlayer;
            matches -= select;

            if (select > 3 || select < 0) {
                System.out.println("Необходимо ввести число от 1 до 3");
                System.out.println("Повторите попытку");
                matches += select;
            } else if (select >= 1 && select <= 3) {

                if (matches <= 0) {
                    name = count % 2 != 0 ? firstPlayer : secondPlayer;
                    System.out.println("Победил игрок " + name);
                    break;
                }
                count++;
                System.out.println("счет спичек остался  " + matches);
                System.out.println("игрок " + name + " делает следующих ход");
            }
        }
    }
}


