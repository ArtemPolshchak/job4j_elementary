package ru.job4j.lambda;

import java.util.function.Predicate;

/**
 * @author Artem Polshchak on 08.10.2021.
 * @project job4j_elementary
 * 1.2. Predicate. Проверить, что число четное
 */
public class PredicateCheckEven {

    public static boolean check(int num) {
        return check(tmp -> tmp % 2 == 0, num);
    }

    private static boolean check(Predicate<Integer> predicate, int num) {
        return predicate.test(num);
    }
}
