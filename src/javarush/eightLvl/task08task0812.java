package javarush.eightLvl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
Cамая длинная последовательность
*/

public class task08task0812 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> list = new ArrayList<>();
        List<Integer> maxNumber = new ArrayList<>();

        int count = 1;

        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        for (int i = 0; i < 9; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                count++;
                maxNumber.add(count);
            } else {
                count = 1;
            }
        }

        if (maxNumber.isEmpty()) {
            System.out.println(1);
        } else {
            System.out.println(Collections.max(maxNumber));
        }
    }
}
