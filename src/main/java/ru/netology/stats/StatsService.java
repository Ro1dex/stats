package ru.netology.stats;

public class StatsService {
    public long allSales(long[] sales) {
        long sum = 0;
        for (long i : sales) {
           sum = sum + i;
       }
        return sum;
    }
    public long midSales(long[] sales) {
        long sum = 0;
        for (long i : sales) {
            sum = sum + i;
        }
        return sum / sales.length;
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
        long sum = 0;
        long minMid = 0;
        for (long i : sales) {
            sum = sum + i;
        }
        long mid = sum / sales.length;
        for (long i : sales) {

            if (i < mid) {
              minMid++;
            }
        }
        return minMid;
    }
    public long maxMidSales(long[] sales) {
        long sum = 0;
        long maxMid = 0;
        for (long i : sales) {
            sum = sum + i;
        }
        long mid = sum / sales.length;
        for (long i : sales) {

            if (i > mid) {
                maxMid++;
            }
        }
        return maxMid;
    }
}