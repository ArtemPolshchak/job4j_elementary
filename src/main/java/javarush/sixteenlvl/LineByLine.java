package javarush.sixteenlvl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Artem Polshchak on 28.01.2022.
 * @project javaRush
 * Только по-очереди!
 * Java Core
 * 6 уровень, 13 лекция
 * 1. В классе Solution создать public static класс нити Read3Strings унаследовавшись от Thread.
 * 2. В методе run реализовать чтение с консоли трех строк.
 * 3. Три подряд введенных строки должны считываться в одной нити и объединяться в одну строку через пробел.
 * 4. В методе main вывести результат для каждой нити.
 * 5. Используй join.
 *
 * Пример:
 *
 * Входные данные:
 * a
 * b
 * c
 * d
 * e
 * f
 *
 * Выходные данные:
 * a b c
 * d e f
 */
public class LineByLine {
    public static volatile AtomicInteger readStringCount = new AtomicInteger(0);
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException, IOException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();

        //add your code here - добавьте код тут
        t1.start();
        t1.join();
        t2.start();
        t1.join();

        t1.printResult();
        t2.printResult();

    }

    //add your code here - добавьте код тут
    public static class Read3Strings extends Thread {
        int count = 0;
        String res = "";

        public void run() {
            //напишите тут ваш код
            try {
                while (count < 3) {
                    res += reader.readLine() + " ";
                    count++;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void printResult() {
            System.out.println(res);
        }

    }
}
