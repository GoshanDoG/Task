public class Profit {
    public static double expences;
    public static double profit;
    public static void countExpencesPerMonth(double rentPerMonth, double salaryPerMonth) {
        expences = (rentPerMonth + salaryPerMonth) * -1 ;
        System.out.println("Затраты за месяц: " + expences);
    }
    public static  void countProfitPerMonth(double revenueArabica, double revenueRobusta, double revenueLiberica) {
        profit = revenueArabica + revenueRobusta + revenueLiberica + expences;
        System.out.println("Наша прибыль/убыль за месяц: " + profit);
    }
}
