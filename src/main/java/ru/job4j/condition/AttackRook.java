package ru.job4j.condition;
public class AttackRook {
        public static boolean check(String left, String right) {
            char[] leftToArray = left.toCharArray();
            char[] rightToArray = right.toCharArray();

            for (int i = 0; i < leftToArray.length; i++) {
                    if (leftToArray[i] == rightToArray[i]) {
                        return true;
                    }
            }
            return false;
        }
    }