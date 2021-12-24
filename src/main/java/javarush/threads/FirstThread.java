package javarush.threads;

/**
 * @author Artem Polshchak on 24.12.2021.
 * @project javaRush
 */
public class FirstThread {
    public static void main(String[] args) {
        TestThread thread = new TestThread();
        thread.start();
    }

    public static class TestThread extends Thread {

        static {
            System.out.println("it's a static block inside TestThread");
        }

        @Override
        public void run() {
            System.out.println("it's a run method");
        }
    }
}


