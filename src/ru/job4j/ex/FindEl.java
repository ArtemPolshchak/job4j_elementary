package ru.job4j.ex;

import javax.swing.text.html.parser.Element;
import java.io.IOException;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int index = 0; index < value.length; index++) {
                if (value[index].equals(key)) {
                    rsl = index;
                    break;
                }
        }
        if (rsl < 0) {
            throw new ElementNotFoundException();

        }
        return rsl;
    }

    public static void main(String[] args)  {
        try {
            String[] elements = {"Hi", "How are you", "can I help you", "mom", "stop"};
            System.out.println(indexOf(elements, "om"));
        } catch (ElementNotFoundException e) {
            System.out.println("данного елемента нет в списке");
        }
    }
}
