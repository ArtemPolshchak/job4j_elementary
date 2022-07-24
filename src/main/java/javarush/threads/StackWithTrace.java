package javarush.threads;

import java.io.InterruptedIOException;

/**
 * @author Artem Polshchak on 24.12.2021.
 * @project JavaRush Вывод стек-трейса
 * Java Core
 * 6 уровень, 3 лекция
 */
public class StackWithTrace {
    public static void main(String[] args) throws InterruptedIOException {
        Thread thread = new Thread(new SpecialThread());
        thread.start();

        System.out.println("*************");

        for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
            System.out.println(element);
        }
    }

    public static class SpecialThread implements Runnable {
        @Override
        public void run() {
            for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
                System.out.println(element);
            }
        }
    }
}
