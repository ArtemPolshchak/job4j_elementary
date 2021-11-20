package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void run() {
    }

    @Override
    public void passengers(int count) {
        count++;
    }

    @Override
    public int tankUp(int oil, int price) {
        return oil * price;
    }
}
