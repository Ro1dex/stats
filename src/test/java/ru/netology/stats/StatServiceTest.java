package ru.netology.stats;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatServiceTest {
    @Test
    public void testAllSales() {
        StatsService service = new StatsService();
        long[] month ={3, 5, 6, 7, 8, 9, 0, 0, 3, 3, 9, 8};
        long expected = 61;
        long actual = service.allSales(month);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testMidSales() {
        StatsService service = new StatsService();
        long[] month ={3, 5, 6, 7, 8, 9, 0, 0, 3, 3, 9, 8};
        double expected = 5.083333333333333;
        double actual = service.midSales(month);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testMaxSales() {
        StatsService service = new StatsService();
        long[] month ={3, 5, 6, 7, 8, 9, 0, 0, 3, 3, 9, 8};
        long expected = 11;
        long actual = service.maxSales(month);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testMinSales() {
        StatsService service = new StatsService();
        long[] month ={3, 5, 6, 7, 8, 9, 0, 0, 3, 3, 9, 8};
        long expected = 8;
        long actual = service.minSales(month);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testMinMidSales() {
        StatsService service = new StatsService();
        long[] month ={3, 5, 6, 7, 8, 9, 0, 0, 3, 3, 9, 8};
        long expected = 6;
        long actual = service.minMidSales(month);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testMaxMidSales() {
        StatsService service = new StatsService();
        long[] month ={3, 5, 6, 7, 8, 9, 0, 0, 3, 3, 9, 8};
        long expected = 6;
        long actual = service.maxMidSales(month);
        Assertions.assertEquals(expected, actual);
    }

}
