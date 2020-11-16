package ru.job4j.io;

import java.util.Scanner;

public class Matches {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matches = 11;
        System.out.println("введите число от 1 до 3");
        while (matches > 0) {

            int select = Integer.parseInt(scanner.nextLine());

            if (select > 3) {
                System.out.println("Необходимо ввести число от 1 до 3");
                System.out.println("Повторите попытку");
            } else if (select == 1) {
                matches -= 1;
                if (matches <= 0) {
                    System.out.println("Победил игрок сделавший данный ход");
                    break;
                }
                System.out.println("счет спичек остался  " + matches);
                System.out.println(" следующий игрок делает ход");
            } else if (select == 2) {
                matches -= 2;
                if (matches <= 0) {
                    System.out.println("Победил игрок сделавший данный ход");
                    break;
                }
                System.out.println("счет спичек остался  " + matches);
                System.out.println(" следующий игрок делает ход");
            } else if (select == 3) {
                matches -= 3;
                if (matches <= 0) {
                    System.out.println("Победил игрок сделавший данный ход");
                    break;
                }
                System.out.println("счет спичек остался  " + matches);
                System.out.println(" следующий игрок делает ход");
            }
        }
    }
}


