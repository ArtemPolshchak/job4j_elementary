package javarush.fiveLvl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class LongBoard {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<>();
        ArrayList<String>  num = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < 5; i++) {
            String str = reader.readLine();
            strings.add(str);
            if (str.length() > count) {
                count = str.length();
            }


        }
        for (String str : strings) {
            if (str.length() == count) {
                num.add(str);
            }
        }
        for (String n : num) {
            System.out.println(n);
        }
    }
}
