package javarush.threads;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Artem Polshchak on 25.12.2021.
 * @project JavaRush Обратный отсчет
 * Java Core
 * 6 уровень, 7 лекция
 * 1. Разберись, что делает программа.
 * 2. Реализуй логику метода printCountdown так,
 * тобы программа каждые полсекунды выводила объект из переменной list.
 * Выводить нужно в обратном порядке - от переданного в Countdown индекса до нуля.
 *
 * Пример:
 * Передан индекс 3
 *
 * Пример вывода в консоль:
 * Строка 2
 * Строка 1
 * Строка 0
 */
public class ReverseCount {
    public static volatile List<String> list = new ArrayList<String>(5);

    static {
        for (int i = 0; i < 5; i++) {
            list.add("Строка " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Countdown(3), "Countdown");
        t.start();
    }




    public static class Countdown implements Runnable {
        private int countFrom;

        public Countdown(int countFrom) {
            this.countFrom = countFrom;
        }

        public void run() {
            try {
                while (countFrom > 0) {
                    printCountdown();
                }
            } catch (InterruptedException e) {
            }
        }

        public void printCountdown() throws InterruptedException {
            //add your code here - добавь код тут
            Thread.sleep(500);
            System.out.println(list.get(--countFrom));
        }
    }
}

