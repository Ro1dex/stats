package ru.netology.stats;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class StatServiceTest {
    StatsService service = new StatsService();
    long[] month ={8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void testAllSales() {
        long expected = 180;
        long actual = service.allSales(month);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testAverageSales() {
        double expected = 15;
        double actual = service.averageSales(month);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testMaxSales() {
        long expected = 8;
        long actual = service.maxSales(month);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testMinSales() {
        long expected = 9;
        long actual = service.minSales(month);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testMinAverageSales() {
        long expected = 5;
        long actual = service.minAverageSales(month);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testMaxAverageSales() {
        long expected = 5;
        long actual = service.maxAverageSales(month);
        Assertions.assertEquals(expected, actual);
    }

}
