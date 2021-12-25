package javarush.threads;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Artem Polshchak on 25.12.2021.
 * @project JavaRush
 * Horse Racing
 * Java Core
 * 6 уровень, 5 лекция
 * Разберись, что делает программа.
 * Реализуй метод calculateHorsesFinished.
 * Он должен:
 * 1. Посчитать количество финишировавших лошадей и возвратить его. Используй метод isFinished().
 * 2. Если лошадь еще не пришла к финишу (!isFinished()), то:
 * 2.1. Вывести в консоль "Waiting for " + horse.getName().
 * 2.2. Подождать, пока она завершит гонку. Подумай, какой метод нужно использовать для этого.
 * 2.3. Не считать такую лошадь финишировавшей.
 */
public class HorseRacing {
    public static void main(String[] args) throws InterruptedException {
        List<Horse> horses = prepareHorsesAndStart(10);
        while (calculateHorsesFinished(horses) != horses.size()) {
        }
    }

    public static int calculateHorsesFinished(List<Horse> horses) throws InterruptedException {
        int finishedCount = 0;
        //напишите тут ваш код
        for (Horse horse : horses) {
            if (!horse.isFinished()) {
                System.out.println("Waiting for " + horse.getName());
                horse.join();
            } else {
                finishedCount++;
            }
        }
        return finishedCount;
    }

    public static List<Horse> prepareHorsesAndStart(int horseCount) {
        List<Horse> horses = new ArrayList<>(horseCount);
        String number;
        for (int i = 1; i < horseCount + 1; i++) {
            number = i < 10 ? ("0" + i) : "" + i;
            horses.add(new Horse("Horse_" + number));
        }

        System.out.println("All horses start the race!");
        for (int i = 0; i < horseCount; i++) {
            horses.get(i).start();
        }
        return horses;
    }
}

class Horse extends Thread {

    private boolean isFinished;

    public Horse(String name) {
        super(name);
    }

    public boolean isFinished() {
        return isFinished;
    }

    public void run() {
        String s = "";
        for (int i = 0; i < 1001; i++) {   // Delay
            s += "" + i;
            if (i == 1000) {
                s = " has finished the race!";
                System.out.println(getName() + s);
                isFinished = true;
            }
        }
    }
}
