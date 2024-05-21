package ru.netoloy.stats.Sales;
public class SalesService {
    //расчет суммы всех продаж;
    public long OllSales(long[] sales) {
        long Oll = 0;
        for (long sale : sales) {
            Oll += sale;
        }
        return Oll;
    }

    // расчет средней суммы продаж в месяц;
    public long AverageAmountSales(long[] sales) {
        long sum = 0;
        long AveregeAmount = 0;
        for (long sale : sales) {
            sum += sale;
            AveregeAmount = sum / 12;
        }
        return AveregeAmount;
    }

    //расчет номера месяца максимальных продаж;
    public int maxSales(long[] sales) {
        int maxMonth = 0;// номер месяца с максимальными  продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {// в рассматриваемом i-м меяце продаж больше
                maxMonth = i;// запомним его как минимальный

            }
        }
        return maxMonth+1;//т.к месяца нумеруются с 1,амассивы с 0, то необходимо добавить 1
    }

    // расчет номера номера месяца минимальных продаж;
    public int minSales(long[] sales) {
        int minMonth = 0;// номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {// в рассматриваемом i-м меяце продаж меньше
                minMonth = i;// запомним его как минимальный

            }
        }
        return minMonth + 1;//т.к месяца нумеруются с 1,амассивы с 0, то необходимо добавить 1
    }

    // расчет количества месяцев, в которых продажи были ниже среднего;
    public int LowAverageSales(long[] sales) {
        long Averege = AverageAmountSales(sales);
        long count = 0;// счетчик месяцев продаж ниже среднего
        for (long sale : sales) {
            if (sale < Averege) {
                count++;

            }
        }
        return (int) count;
    }

    // расчет количество месяцев, в которых продажи были выше среднего;
    public int AboveAveregeSales(long[] sales) {
        long Averege = AverageAmountSales(sales);
        long count = 0;// счетчик месяцев продаж выше среднего
        for (long sale : sales) {
            if (sale > Averege) {
                count++;

            }
        }
        return (int) count;
    }
}

