package javarush.stream;

import java.util.stream.Stream;

public class ExampleStreamMap {
    public static void main(String[] args) {
        Stream.of("two", "var", "four").map(String::length).forEach(System.out::println);
    }
}
