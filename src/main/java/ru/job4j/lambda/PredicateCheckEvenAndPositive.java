package ru.job4j.lambda;

import java.util.function.Predicate;

/**
 * @author Artem Polshchak on 08.10.2021.
 * @project job4j_elementary
 * 1.3. Predicate. Проверить, что число положительное и четное
 */
public class PredicateCheckEvenAndPositive {

    public static boolean check(int num) {
        return check(tmp -> tmp > 0 && tmp % 2 == 0, num);
    }

    private static boolean check(Predicate<Integer> predicate, int num) {
        return predicate.test(num);
    }
}
