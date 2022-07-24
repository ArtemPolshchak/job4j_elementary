package javarush.corenine;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/*
Контекстная реклама
*/

public class PrintStreamExample {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        testString.printSomething();
        String result = outputStream.toString();
        System.setOut(consoleStream);
        int count = 1;
        String[] res = result.split("\\n");
        for (String re : res) {
            System.out.println(re);
            if (count == 2) {
                System.out.println("JavaRush - курсы Java онлайн");
                count = 0;
            }
            count++;
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
