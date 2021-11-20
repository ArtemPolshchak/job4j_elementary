package javarush.fourLvl;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class task04task0436 {
    /*Ввести с клавиатуры два числа m и n.
    Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.

    Пример: m=2, n=4
            8888
            8888

    Требования:
            •	Программа должна считывать два числа c клавиатуры.
            •	Программа должна выводить текст на экран.
            •	Программа должна выводить прямоугольник размером m на n из восьмёрок.
            •	В программе должен использоваться цикл for.*/
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int first = Integer.parseInt(reader.readLine());
        int second = Integer.parseInt(reader.readLine());
        int num = 8;
        for (int i = 0; i < first; i++) {
            for (int j = 1; j < second; j++) {
                System.out.print(num);
            }
            System.out.println(num);
        }
    }
}
