package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {

        for (User user : users) {
            if (user.getUsername().equals(login)) {
                return user;
            }
        }
        throw new UserNotFoundException("User does not found");
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.getUsername().length() <= 3 || !user.isValid()) {
            throw new UserInvalidException("user is invalid");
        }
        return true;
    }

    public static void main(String[] args) throws UserNotFoundException {
        try {
            User[] users = {
                    new User("Petr Arsentev", true)
            };
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException userInvalidException) {
            throw new UserInvalidException("Пользователь не валидный");
        } catch (UserNotFoundException userNotFoundException) {
            throw new UserNotFoundException("Пользьвателя не найдено");
        }

    }
}
