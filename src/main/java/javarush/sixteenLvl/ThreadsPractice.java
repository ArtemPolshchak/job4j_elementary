package javarush.sixteenLvl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Artem Polshchak on 27.01.2022.
 * @project javaRush Java Core
 * 6 уровень, 1 лекция
 * 1. Создай 5 различных своих нитей (наследников класса Thread):
 * 1.1. Нить 1 должна бесконечно выполняться;
 * 1.2. Нить 2 должна выводить "InterruptedException" при возникновении исключения InterruptedException;
 * 1.3. Нить 3 должна каждые полсекунды выводить "Ура";
 * 1.4. Нить 4 должна реализовать интерфейс Message, при вызове метода showWarning нить должна останавливаться;
 * 1.5. Нить 5 должна читать с консоли числа пока не введено слово "N", а потом вывести в консоль сумму введенных чисел.
 * 2. В статическом блоке добавь свои нити в List<Thread> threads в перечисленном порядке.
 * 3. Нити не должны стартовать автоматически.
 */
public class ThreadsPractice {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        ThreadOne one = new ThreadOne();
        ThreadTwo two = new ThreadTwo();
        ThreadThree three = new ThreadThree();
        ThreadFour four = new ThreadFour();
        ThreadFive five = new ThreadFive();

        Thread threadOne = new Thread(one);
        Thread threadTwo = new Thread(two);
        Thread threadThree = new Thread(three);

        Thread threadFive = new Thread(five);

        threads.add(threadOne);
        threads.add(threadTwo);
        threads.add(threadThree);
        threads.add(four);
        threads.add(threadFive);

    }

    public static void main(String[] args) throws InterruptedException {

    }
}

class  ThreadOne extends Thread {
    @Override
    public void run() {
        Thread current = Thread.currentThread();

        while (!current.isInterrupted()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

class  ThreadTwo extends Thread {
    @Override
    public void run() {
        try {
                Thread.sleep(500);
        } catch (InterruptedException e) {
                System.out.println("InterruptedException");
        }
    }
}

class  ThreadThree extends Thread {
    @Override
    public void run() {
        Thread current = Thread.currentThread();

        while (!current.isInterrupted()) {
            try {
                System.out.println("Ура");
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class  ThreadFour extends Thread implements Message {
    @Override
    public void run() {

        while (!interrupted()){

        }
    }

    @Override
    public void showWarning()  {
        this.interrupt();

    }
}

class  ThreadFive extends Thread {
    @Override
    public void run() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String str;
            int sum = 0;
            while (!(str = reader.readLine()).contains("N")) {
                   int num = Integer.parseInt(str);
                   sum += num;
            }
            System.out.println(sum);
        } catch (IOException e) {
                e.printStackTrace();
        }
    }
}


