package javarush.threads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Artem Polshchak 24.12.2021.
 * @project JavaRush Java Core
 * 6 уровень, 3 лекция
 */
public class ListAndThreads {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Collections.addAll(list, new Thread(new SpecialThread()));
        }
    }

    public static class SpecialThread implements Runnable {
        @Override
        public void run() {
            System.out.println("it`s a run method inside SpecialThread");
        }
    }
}
