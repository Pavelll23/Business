public class Main {
    int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        public int amountSales(int[] sales) {
            int result = sales[0];
            for (int sale : sales) {
                result = sales[0] + sale;
            }
            return result;
        }
}


