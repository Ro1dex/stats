package ru.netology.stats;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;

public class StatServiceTest {
    @Test
    @CsvSource("'8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18'")
    public void allSalesTest(long[] monthSales) {
        StatsService service = new StatsService();

       long expected = 180;
       long actual = service.allSales(monthSales);
        Assertions.assertEquals(expected, actual);

    }
}
