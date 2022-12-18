package ru.job4j.array;

public class RightShift {

    public static void shift(int[] nums, int count) {
        int size = nums.length;
        for (int i = 0; i < count; i++) {
            int tmp = nums[size - 1];

            System.arraycopy(nums, 0, nums, 1, size - 1);

            nums[0] = tmp;
        }

    }

    public static void shift(int[] nums) {
        int size = nums.length;
        int tmp = nums[size - 1];
        System.arraycopy(nums, 0, nums, 1, size - 1);
        nums[0] = tmp;
    }

}

