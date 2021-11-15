package ru.job4j.array;

public class SumOfDifferences {
    public static int sum(int[] nums) {
            int[] res = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j <= nums.length - 1; j++) {
                 res[j] = nums[i] - nums[j];
            }
        }
        for (int re : res) {
            sum += re;
        }

        return sum;
        }
    }

