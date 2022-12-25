package ru.job4j.early;

/**
 * @author artem.polschak@gmail.com on 19.12.2022.
 * @project job4j_elementary
 * class makes validation of password
 */
public class PasswordValidator {

    private static final String[] WORDS = new String[] {"qwerty", "12345", "password", "admin", "user"};

    /**
     * Method checks the password for compliance with the necessary conditions
     * @param password parameter to check conditions
     * @return password word that matches the required verification conditions
     */
    public static String validate(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }

        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }

        boolean isUpperLetter = false;
        boolean isLowerLetter = false;
        boolean isDigit = false;
        boolean isSpecialSymbol = false;

        for (char temp : password.toCharArray()) {
            if (Character.isUpperCase(temp)) {
                isUpperLetter = true;
            }
            if (Character.isLowerCase(temp)) {
                isLowerLetter = true;
            }
            if (Character.isDigit(temp)) {
                isDigit = true;
            }
            if (!Character.isDigit(temp) && !Character.isLetter(temp)) {
                isSpecialSymbol = true;
            }
        }

        if (!isUpperLetter || !isLowerLetter || !isDigit || !isSpecialSymbol) {
            throw new IllegalArgumentException("Password should contain at least one uppercase letter, "
                    + "one lowercase letter, one figure, one special symbol");
        }

        for (String s : WORDS) {
            if (password.toLowerCase().contains(s)) {
                throw new IllegalArgumentException("Password shouldn't contain substrings: "
                        + "qwerty, 12345, password, admin, user");
            }
        }
        return password;
    }
}
