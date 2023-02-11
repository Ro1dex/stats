package ru.netology;
import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {

        long[] monthSales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        StatsService service = new StatsService();
        System.out.println("Общие месячные продажи составили: " + service.allSales(monthSales));
        System.out.println("Среднемесячные продажи составили: " + service.midSales(monthSales));
        System.out.println("Месяц с самыми большими продажами: " + service.maxSales(monthSales));
        System.out.println("Месяц с самыми меньшими продажами: " + service.minSales(monthSales));
        System.out.println("Количество месяцев меньше среднемесячных продаж: " + service.minMidSales(monthSales));
        System.out.println("Количество месяцев больше среднемесячных продаж: " + service.maxMidSales(monthSales));
    }
}