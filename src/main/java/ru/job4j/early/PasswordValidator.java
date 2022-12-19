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

        if (!isUpperLatinLetter(password)) {
            throw new IllegalArgumentException("Password should contain at least one uppercase letter");
        }

        if (!isLowerLatinLetter(password)) {
            throw new IllegalArgumentException("Password should contain at least one lowercase letter");
        }

        if (!isDigitLetter(password)) {
            throw new IllegalArgumentException("Password should contain at least one figure");
        }

        if (!isSpecialSymbol(password)) {
            throw new IllegalArgumentException("Password should contain at least one special symbol");
        }

        for (String s : WORDS) {
            if (password.toLowerCase().contains(s)) {
                throw new IllegalArgumentException("Password shouldn't contain substrings: "
                        + "qwerty, 12345, password, admin, user");
            }
        }
        return password;
    }

    /**
     * Method check if the character is a dollar sign and lowerCase
     *
     * @param str int with char number in unicode for check what symbol is it
     * @return result true of false
     */
    public static boolean isSpecialSymbol(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i)) && !Character.isLetter(str.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    /**
     * The method checks if the word contains at least one letter in a upperCase
     *
     * @param str in which need to find at least one letter in a upperCase
     * @return true if at least one upperCase letter is present,
     * false if there is not letters in upperCase in the word
     */
    public static boolean isUpperLatinLetter(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    /**
     * The method checks if the word contains at least one letter in a lowerCase
     *
     * @param str in which need to find at least one letter in a lowerCase
     * @return true if at least one lowerCase letter is present,
     * false if there is not letters in lowerCase in the word
     */
    public static boolean isLowerLatinLetter(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    /**
     * The method checks if the word contains at least one digit
     *
     * @param str in which need to find at least one digit
     * @return true if at least one digit is present, false if there is no digit in the word
     */
    public static boolean isDigitLetter(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                return true;
            }
        }
        return false;
    }
}
