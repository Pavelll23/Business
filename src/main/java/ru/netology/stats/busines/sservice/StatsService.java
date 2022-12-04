package ru.netology.stats.busines.sservice;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int amountSales(int[] sales) { // Сумма всех продаж
        int result = 0;
        for (int sale : sales) {
            result = result + sale;
        }
        return result;
    }

    public int avarageAmount(int[] sales) { // Средняя сумма продаж в месяц
        int result = 0;
        for (int sale : sales) {
            result = result + sale;
        }
        return result / sales.length;
    }

    public int maxSales(int[] sales) { // Номер месяца пик продаж
        int maxMonth = 0;
        int maxCash = 0;
        int [] result = new int[13];
        int numbers = 0;
        for (int sale : sales){
            if (sale >= maxCash){
                maxCash = sale;
            }
        }
        for (long sale : sales) {
            numbers = numbers + 1;
            if (sale >= maxCash) {
               result[numbers] = numbers;
            }
        }
        return result[numbers];
    }



    public int numbersBelowAvarage(int[] sales) { // Количество месяцев с продажами ниже среднего
        int result = 0;
        int monthMinSale = 0;
        int avarage = 0;
        for (int sale : sales) {
            result = result + sale;
        }
        avarage = result / sales.length;
        for (int sale : sales) {
            if (sale < avarage) {
                monthMinSale = monthMinSale + 1;
            }
        }
        return monthMinSale;
    }

    public int monthsAboveAvarage(int[] sales) { // Количество месяцев с продажами выше среднего
        int result = 0;
        int monthMaxSale = 0;
        int avarage = 0;
        for (int sale : sales) {
            result = result + sale;
        }
        avarage = result / sales.length;
        for (int sale : sales) {
            if (sale > avarage) {
                monthMaxSale = monthMaxSale + 1;
            }
        }
        return monthMaxSale;
    }
}


