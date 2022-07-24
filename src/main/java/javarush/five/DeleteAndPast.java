package javarush.five;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class DeleteAndPast {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }

        for (int i = 0; i < 13; i++) {
            list.add(0, list.remove(4));

        }
        for (String s : list) {
            System.out.println(s);
        }
    }
}
