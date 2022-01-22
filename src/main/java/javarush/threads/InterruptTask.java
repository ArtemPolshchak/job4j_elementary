package javarush.threads;

/**
 * @author Artem Polshchak on 25.12.2021.
 * @project JavaRush А без interrupt слабо?
 * Java Core
 * 6 уровень, 10 лекция
 * Разберись, как работает программа.
 * Реализуй метод ourInterruptMethod таким образом, чтобы он прерывал нить TestThread.
 * Исправь остальной код программы, если это необходимо. Нельзя использовать метод interrupt.
 */
public class InterruptTask {
    static boolean close = true;
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new TestThread());
        t.start();
        Thread.sleep(3000);
        ourInterruptMethod();
    }

    public static void ourInterruptMethod() {
        close = false;

    }

    public static class TestThread implements Runnable {
        public void run() {
            while (close) {
                try {
                    System.out.println("he-he");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}