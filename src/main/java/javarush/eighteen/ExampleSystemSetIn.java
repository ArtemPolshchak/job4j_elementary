package javarush.eighteen;

import java.io.*;

/**
 * @author Artem Polshchak on 01.02.2022.
 * @project javaRush
 */
public class ExampleSystemSetIn {
    public static void main(String[] args) throws IOException {
        PrintStream printStream = new PrintStream("time.txt");
        printStream.println(222);
        printStream.println("hello world");
        printStream.printf("My name is %s, my age is %d, my music is %s, I love %b", "Artem", 18, "Rock", "Tania");
        printStream.close();

        String greetings = "Привет! Меня зовут Амиго!\nЯ изучаю Java на сайте JavaRush.\nОднажды я стану крутым";
        byte[] bytes = greetings.getBytes();

        InputStream inputStream = new ByteArrayInputStream(bytes);

        System.setIn(inputStream);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str;

        while ((str = reader.readLine()) != null) {
            System.out.println(str);
        }
    }
}
