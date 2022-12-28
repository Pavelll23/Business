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

    public int avarageAmount(int[] sales) {  // Средняя сумма продаж в месяц
        int sum = amountSales(sales) / sales.length;

        return sum;
    }

    public int maxSales(int[] sales) { // Номер месяца пик продаж
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int numbersBelowAvarage(int[] sales) { // Количество месяцев с продажами ниже среднего
        int monthMinSale = 0;

        for (int sale : sales) {
            if (sale < avarageAmount(sales)) {
                monthMinSale = monthMinSale + 1;
            }
        }
        return monthMinSale;
    }

    public int monthsAboveAvarage(int[] sales) { // Количество месяцев с продажами выше среднего
        int monthMaxSale = 0;

        for (int sale : sales) {
            if (sale > avarageAmount(sales)) {
                monthMaxSale = monthMaxSale + 1;
            }
        }
        return monthMaxSale;
    }
}


