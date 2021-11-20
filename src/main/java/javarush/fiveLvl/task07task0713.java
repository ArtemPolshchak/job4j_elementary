package javarush.fiveLvl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Играем в Jолушку
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
Порядок объявления списков очень важен.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.

*/

public class task07task0713 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> numDivideOnThree = new ArrayList<>();
        ArrayList<Integer> numDivideOnTwo = new ArrayList<>();
        ArrayList<Integer> numOthers = new ArrayList<>();
        int count = 0;
        while (count < 20) {
           list.add(Integer.parseInt(reader.readLine()));

            count++;
        }
        for (int tmp : list) {
            if (tmp % 2 == 0) {
                numDivideOnTwo.add(tmp);
            }

            if (tmp % 3 == 0) {
                numDivideOnThree.add(tmp);
            }

            if (tmp % 3 != 0 && tmp % 2 != 0) {
                numOthers.add(tmp);
            }
        }
        //printList(list);
        printList(numDivideOnThree);
        printList(numDivideOnTwo);
        printList(numOthers);

    }

    public static void printList(ArrayList<Integer> list) {
        for (int a : list) {
            System.out.println(a);
        }
    }
}
