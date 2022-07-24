package javarush.sixteenlvl;

/**
 * @author Artem Polshchak on 28.01.2022.
 * @project javaRush Отдебажим все на свете
 * Java Core
 * 6 уровень, 13 лекция
 *
 * Разобраться, что делает программа.
 *
 * Почитать про UncaughtExceptionHandler - это важно.
 *
 * Еще раз внимательно посмотреть программу.
 *
 * Разобраться - продебажить - почему наш OurUncaughtExceptionHandler не срабатывает.
 *
 * Исправить ошибку, т.е. все должно работать. :)
 *
 * Ожидаемый результат в произвольном порядке:
 *
 * Нить 1: My exception message
 *
 * Нить 2: My exception message
 */
public class DebagTask {
    public static Thread.UncaughtExceptionHandler handler = new OurUncaughtExceptionHandler();

    public static void main(String[] args) {
        TestedThread commonThread = new TestedThread(handler);

        Thread threadA = new Thread(commonThread, "Нить 1");
        Thread threadB = new Thread(commonThread, "Нить 2");

        threadA.start();
        threadB.start();

        threadA.setUncaughtExceptionHandler(handler);
        threadB.setUncaughtExceptionHandler(handler);

        threadA.interrupt();
        threadB.interrupt();
    }

    public static class TestedThread extends Thread {
        public TestedThread(Thread.UncaughtExceptionHandler handler) {
            setUncaughtExceptionHandler(handler);
            start();
        }

        public void run() {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException("My exception message");
            }
        }
    }

    public static class OurUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
        @Override
        public void uncaughtException(Thread t, Throwable e) {
            System.out.println(t.getName() + ": " + e.getMessage());
        }
    }
}
