package javarush.fourteen;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Разные методы для разных типов
*/

public class DifferentTypesForMethods {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        while (!str.equals("exit")) {
        try {
            if (str.contains(".")) {
                print(Double.parseDouble(str));
            } else if (Integer.parseInt(str) <= 0 || Integer.parseInt(str) >= 128) {
                    print(Integer.parseInt(str));
            } else if (Short.parseShort(str) > 0 && Short.parseShort(str) < 128) {
                print(Short.parseShort(str));
            }

        } catch (Exception e) {
            print(str);
        }
            str = reader.readLine();
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
