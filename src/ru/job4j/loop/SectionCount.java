package ru.job4j.loop;

public class SectionCount {
    public static int count(int length, int section) {
        int count = 0;
        while (length > 0) {

            if (length - section < 0)  {
                break;
            }
            length -= section;
            count++;
        }
        return count;
    }
}
