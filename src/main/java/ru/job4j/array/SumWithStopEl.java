package ru.job4j.array;

public class SumWithStopEl {
    public static int count(int[] data, int el) {
        int count = 0;
        int result = 0;
        for (int i = 0; i < data.length; i++) {

            if (data[i] == el) {
                if (count % 2 != 0) {
                    result = 0;
                } else {
                    result = count;
                }
            }
            count += data[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int el = 7;

        int count = 0;
        for (int i = 0; i < data.length; i++) {

            if (data[i] == el) {
                if (count % 2 != 0) {
                    System.out.println(0);
                } else {
                    System.out.println(count);
                }
            }
            count += data[i];
        }
    }
}


