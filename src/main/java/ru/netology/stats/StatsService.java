package ru.netology.stats;

public class StatsService {
    public long allSales(long[] sales) {
        long sum = 0;
        for (long i : sales) {
            sum += i;
        }
        return sum;
    }

    //так как средния значения могут быть дробными использовать параметр double
    public double averageSales(long[] sales) {
        double totalSales = allSales(sales);
        return totalSales / sales.length;
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

    public long minAverageSales(long[] sales) {

        int minAverage = 0;
        double average = averageSales(sales);
        for (double i : sales) {
            if (i < average) {
                minAverage++;
            }
        }
        return minAverage;
    }

    public long maxAverageSales(long[] sales) {
        long maxAverage = 0;
        double average = averageSales(sales);
        for (long i : sales) {
            if (i > average) {
                maxAverage++;
            }
        }
        return maxAverage;
    }
}
