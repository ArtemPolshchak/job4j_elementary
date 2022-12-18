package ru.job4j.condition;

public class WeeklySalary {
    /*
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


    public static int calculate(int[] hours) {

        int res = 0;

        for (int i = 0; i < hours.length; i++) {
            int salary = getSalaryFromDay(hours[i]);
            if (i >= 5) {
                salary *= 2;
            }

            res += salary;
        }
        return res;
    }

        private static int getSalaryFromDay(int hoursInOneDay) {
        if (hoursInOneDay > 8) {
            hoursInOneDay = ((hoursInOneDay - 8) * 15 + 80);
        } else {
            hoursInOneDay *= 10;
        }
        return  hoursInOneDay;

        }

     */
    public static int calculate(int[] hours) {
        int salary = 0;

        for (int i = 0; i < hours.length; i++) {
            int salaryPerDay = getSalaryFromDay(hours[i]);
            if (i <= 4) {
                salary = salary + salaryPerDay;
            } else {
                salaryPerDay = salaryPerDay * 2;
                salary = salary + salaryPerDay;
            }
        }
        return salary;
    }

    private static int getSalaryFromDay(int hoursInOneDay) {

        int salaryPerDay;
        if (hoursInOneDay <= 8) {
            salaryPerDay = hoursInOneDay * 10;
        } else {
            int additionalHours = hoursInOneDay - 8;
            int additionalHoursSalary = additionalHours * 15;
            salaryPerDay = 80 + additionalHoursSalary;
        }
        return salaryPerDay;
    }
}

