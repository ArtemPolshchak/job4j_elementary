package javarush.fiveLvl;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Числа по возрастанию
*/

public class HomeEvenOddPeoples {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int even = 0;
        int odd = 0;
        int[] list = new int[15];
        for (int i = 0; i < list.length; i++) {
            int tmp = Integer.parseInt(reader.readLine());
            list[i] = tmp;
            if (i % 2 != 0) {
                odd += list[i];
            } else {
                even += list[i];
            }
        }
        if (even > odd) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        } else if (even < odd){
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
    }
}