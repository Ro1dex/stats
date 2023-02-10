package ru.netology;
import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {

        long[] monthSales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        StatsService service = new StatsService();
        System.out.println(service.minSales(monthSales));
        System.out.println(service.allSales(monthSales));
        System.out.println(service.midSales(monthSales));
        System.out.println(service.maxSales(monthSales));
        System.out.println(service.minMidSales(monthSales));
        System.out.println(service.maxMidSales(monthSales));
    }
}