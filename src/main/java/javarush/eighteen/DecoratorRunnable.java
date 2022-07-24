package javarush.eighteen;

/**
 * @author Artem Polshchak on 01.02.2022.
 * @project javaRush
 * Wrapper (Decorator)
 * Java Core
 * 8 уровень, 8 лекция
 * Разберись, что делает программа.
 * Аналогично классу DecoratorRunnableImpl создай класс DecoratorMyRunnableImpl.
 * Вывод в консоль должен быть таким:
 * DecoratorRunnableImpl body
 * DecoratorMyRunnableImpl body
 * RunnableImpl body
 */
public class DecoratorRunnable {

    public static void main(String[] args) {
        new Thread(new DecoratorRunnableImpl(new DecoratorMyRunnableImpl(new RunnableImpl()))).start();
    }

    public static class RunnableImpl implements Runnable {
        @Override
        public void run() {
            System.out.println("RunnableImpl body");
        }
    }

    public static class DecoratorRunnableImpl implements Runnable {
        private Runnable component;

        public DecoratorRunnableImpl(Runnable component) {
            this.component = component;
        }

        @Override
        public void run() {
            System.out.println("DecoratorRunnableImpl body");
            component.run();
        }
    }

    public static class DecoratorMyRunnableImpl implements Runnable {
        private Runnable component;

        public DecoratorMyRunnableImpl(Runnable component) {
            this.component = component;
        }

        @Override
        public void run() {
            System.out.println("DecoratorMyRunnableImpl body");
            component.run();
        }

    }

}