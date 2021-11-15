package ru.job4j.poly;

public interface Transport {
  public void run();

  public void passengers(int count);

  public int tankUp(int oil, int price);
}
