package ru.job4j.array;

/**
 * @author artem.polschak@gmail.com on 18.12.2022.
 * @project job4j_elementary
 * class checks the validity of names
 */
public class JavaNameValidator {

    /**
     * Method checks tha validity of names
     * @param name input parameter for check
     * @return boolean true if name is valid or false if the name is not valid
     */
    public static boolean isNameValid(String name) {
        boolean result = false;
        if (name.length() > 0 && isLowerLatinLetter(name.charAt(0))) {
            for (int i = 1; i < name.length(); i++) {
                char res = name.charAt(i);
                if (isSpecialSymbol(res)
                        || isUpperLatinLetter(res)
                        || isLowerLatinLetter(res)
                        || Character.isDigit(res)) {
                    result = true;
                }
            }
        }
        return result;
    }

    /**
     * Method check if the character is a dollar sign and lowerCase
     * @param code int with char number in unicode for check what symbol is it
     * @return result true of false
     */
    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    /**
     * Method check if the character is an upperCase latin character
     * @param code int with char number in unicode for check what symbol is it
     * @return result true of false
     */
    public static boolean isUpperLatinLetter(int code) {
        return code >=65 && code <= 90;
    }

    /**
     * Method check if the character is an lowerCase latin character
     * @param code int with char number in unicode for check what symbol is it
     * @return result true of false
     */
    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 122;
    }
}
