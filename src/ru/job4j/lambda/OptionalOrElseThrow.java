package ru.job4j.lambda;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalOrElseThrow {

    public static class User {
        private final String login;

        public User(String login) {
            this.login = login;
        }

        public String getLogin() {
            return login;
        }
    }

    public static class UserNotFoundException extends RuntimeException{}

    public static User orElseThrow(List<User> list, String login) {
        Optional<User> optional = Optional.of(search(list, login).orElseThrow(UserNotFoundException::new));
        return optional.get();
    }

    private static Optional<User> search(List<User> list, String login) {
        Optional<User> user = Optional.empty();
        for (User s : list) {
            if (login.equals(s.getLogin())) {
                user = Optional.of(s);
            }
        }
        return user;
    }
}
