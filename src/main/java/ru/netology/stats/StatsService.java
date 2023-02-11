package ru.netology.stats;

public class StatsService {
    public long allSales(long[] sales) {
        long sum = 0;
        for (long i : sales) {
            sum = sum + i;
        }
        return sum;
    }

    //так как средния значения могут быть дробными использовать параметр double
    public double midSales(long[] sales) {

        return (double) allSales(sales) / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month++;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month++;
        }
        return minMonth + 1;
    }

    public long minMidSales(long[] sales) {

        int minMid = 0;
        for (double i : sales) {
            if (i < midSales(sales)) {
                minMid++;
            }
        }
        return minMid;
    }

    public long maxMidSales(long[] sales) {
        long maxMid = 0;
        for (long i : sales) {
            if (i > midSales(sales)) {
                maxMid++;
            }
        }
        return maxMid;
    }
}
