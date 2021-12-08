package javarush.stream;


import java.util.Optional;

public class OptionalExample {
    static Optional<String> getOne() {
        return Optional.empty();
    }

    static Optional<String> getTwo() {
        return Optional.of("twoo");
    }
    public static void main(String[] args) {
        getOne().or(() -> getTwo()).ifPresent(System.out::println);
    }
}
