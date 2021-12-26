package javarush.eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/*
Модернизация ПО
*/

public class task08task0829 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> map = new HashMap<>();
        String family;
        while (!(family = reader.readLine()).isEmpty()) {
            String city = reader.readLine();
            map.put(family, city);
            if (city.isEmpty()){
                break;
            }

        }

        // Read the house number
        String city = reader.readLine();
       for (Map.Entry<String, String> entry : map.entrySet()) {

           if (city.equals(entry.getKey())) {
               System.out.println(entry.getValue());
               break;
           }
       }
    }
}

