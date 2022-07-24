package javarush.five;

import java.util.HashMap;
import java.util.Map;

public class TaskWithHashMap {
    public static void main(String[] args) {
        String[] cats = {
                "васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"
        };

        Map<String, Cat> map = addCatsToMap(cats);

        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }

    public static Map<String, Cat> addCatsToMap(String[] cats) {
        Map<String, Cat> cat = new HashMap<>();
        for (String s : cats) {
            cat.put(s, new Cat(s));
        }
        return cat;
    }

    public static class Cat {
        String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name != null ? name.toUpperCase() : null;
        }
    }
}
