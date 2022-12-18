package ru.job4j.array;

import java.util.Arrays;

public class SymmetricDiff {
    public static int[] diff(int[] left, int[] right) {

        int sumArraysLength = left.length + right.length;

        if (right.length == 0) {
            return left;
        } else if (left.length == 0) {
            return right;
        }

        boolean resTry = false;
        int[] numsForTrue = new int[sumArraysLength];
        int countForTrue = 0;

        for (int k : left) {
            int tempRes = 0;
            for (int i : right) {

                if (k != i) {
                    tempRes = k;
                    resTry = true;
                } else {
                    resTry = false;
                    break;
                }
            }
            if (resTry) {
                numsForTrue[countForTrue++] = tempRes;
            }

        }

        for (int k : right) {
            int tempRes = 0;
            for (int i : left) {

                if (k != i) {
                    tempRes = k;
                    resTry = true;
                } else {
                    resTry = false;
                    break;
                }
            }
            if (resTry) {
                numsForTrue[countForTrue++] = tempRes;
            }
        }

        int cnt = 0;
        for (int i = 0; i < numsForTrue.length; i++) {
            if (numsForTrue[cnt] != 0) {
                cnt++;
            }
        }
       // Arrays.copyOf(numsForTrue, cnt );
        int[] result = new int[cnt];
        System.arraycopy(numsForTrue, 0, result, 0, result.length);
        Arrays.sort(result);
        return result;
    }
}
