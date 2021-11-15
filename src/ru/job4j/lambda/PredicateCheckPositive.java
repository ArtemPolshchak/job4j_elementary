package ru.job4j.lambda;

/**
 * @author Artem Polshchak on 08.10.2021.
 * @project job4j_elementary_lambda
 *1.1. Predicate. Проверить, что число положительное
 */
import java.util.function.Predicate;

public class PredicateCheckPositive {

    public static boolean check(int num) {
         return check(number -> number > 0, num);
    }

    private static boolean check(Predicate<Integer> predicate, int num) {
        return predicate.test(num);
    }
}