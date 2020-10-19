package ru.job4j.condition;

public class WeeklySalary {

        public static int calculate(int[] hours) {

            int res = 0;
            for (int i = 0; i < hours.length; i++) {
                int hour = hours[i];
                int  money = hour > 8 ? ((hour - 8) * 15 + 80) : hour * 10;

                if (i >= 5) {
                    money *= 2;
                }
                res += money;
            }
            return res;
        }

    }

