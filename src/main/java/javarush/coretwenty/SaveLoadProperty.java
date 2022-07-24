package javarush.coretwenty;

import java.io.*;
import java.util.*;

public class SaveLoadProperty {

    public static Map<String, String> runtimeStorage = new HashMap<>();

    public static void save(OutputStream outputStream) throws Exception {
        //напишите тут ваш код
        Properties properties = new Properties();
        for (Map.Entry<String, String> entry : runtimeStorage.entrySet()) {
            properties.setProperty(entry.getKey(), entry.getValue());
        }
        properties.store(outputStream, null);
    }

    public static void load(InputStream inputStream) throws IOException {
        //напишите тут ваш код
        Properties properties = new Properties();
        properties.load(inputStream);
        runtimeStorage = new HashMap(properties);
    }

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fos = new FileInputStream(reader.readLine())) {
            load(fos);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(runtimeStorage);
    }
}
