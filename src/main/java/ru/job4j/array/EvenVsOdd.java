package ru.job4j.array;

public class EvenVsOdd {
    public static int whoWin(int[] players) {
        int firstTeam = 0;
        int secondTeam = 0;
        for (int i = 0; i < players.length; i++) {
            if (i % 2 != 0) {
                secondTeam += players[i];

            } else {
                firstTeam += players[i];
            }
        }

        if (firstTeam > secondTeam) {
            return 1;
        } else if (secondTeam > firstTeam) {
            return 2;
        } else {
            return 0;
        }

    }
}
