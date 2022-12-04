package ru.netology.stats.busines.sservice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.busines.sservice.StatsService;

public class StatsServiceTest {
    @Test
    public void minSales(){
        StatsService service = new StatsService();

        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.minSales(sale);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void amountSales(){
        StatsService service = new StatsService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.amountSales(sale);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void avarageAmount(){
        StatsService service = new StatsService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.avarageAmount(sale);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxSales(){
        StatsService service = new StatsService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 7 ;
        int actual = service.maxSales(sale);

        Assertions.assertEquals(expected,actual);
    }



    @Test
    public void numbersBelowAvarage(){
        StatsService service = new StatsService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.numbersBelowAvarage(sale);

        Assertions.assertEquals(expected, actual);
    }

    @Test void  monthsAboveAvarage(){
        StatsService service = new StatsService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.monthsAboveAvarage(sale);

        Assertions.assertEquals(expected, actual);
    }

}
