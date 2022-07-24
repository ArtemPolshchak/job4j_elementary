package javarush.threads;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Artem Polshchak on 25.12.2021.
 * @project JavaRush Один для всех, все - для одного
 * Java Core
 * 6 уровень, 10 лекция
 * 1. Разберись, как работает программа.
 * 1.1. Обрати внимание, что объект Water - один для всех нитей.
 * 2. Реализуй метод ourInterruptMethod, чтобы он прерывал все нити из threads.
 * 3. В методе run исправь значения переменных:
 * 3.1. isCurrentThreadInterrupted - должна равняться значению метода isInterrupted у текущей нити.
 * 3.2. threadName - должна равняться значению метода getName (реализовано в классе Thread) у текущей нити.
 */
public class OneForEveryOne {

    public static byte threadCount = 3;
    static List<Thread> threads = new ArrayList<>(threadCount);

    public static void main(String[] args) throws InterruptedException {
        initThreadsAndStart();
        Thread.sleep(3000);
        ourInterruptMethod();
    }

    public static void ourInterruptMethod() {
        for (int i = 0; i < threadCount; i++) {
            threads.get(i).interrupt();
        }
    }

    private static void  initThreadsAndStart() {
        Water water = new Water("water");
        for (int i = 0; i < threadCount; i++) {
            threads.add(new Thread(water, "#" + i));
        }
        for (int i = 0; i < threadCount; i++) {
            threads.get(i).start();
        }
    }

    public static class Water implements Runnable {
        boolean isCurrentThreadInterrupted = Thread.currentThread().isInterrupted();
        private String sharedResource;

        public Water(String sharedResource) {
            this.sharedResource = sharedResource;
        }

        public void run() {

            String threadName = Thread.currentThread().getName();

            try {
                while (!isCurrentThreadInterrupted) {
                    System.out.println("Объект " + sharedResource + ", нить " + threadName);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
            }
        }
    }
}
