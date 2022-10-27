public class Coffee {
    public static double rublePerGramArabica;
    public static double rublePerGramRobusta;
    public static double rublePerGramLiberica;
    public static double weightInGramsArabica;
    public static double weightInGramsRobusta;
    public static double weightInGramsLiberica;
    public static double pricePerPurchaseArabica;
    public static double pricePerPurchaseRobusta;
    public static double pricePerPurchaseLiberica;
    public static String brand;
    public static double priceWithMarginArabica;
    public static double priceWithMarginRobusta;
    public static double priceWithMarginLiberica;
    public static double revenueArabica;
    public static double revenueRobusta;
    public static double revenueLiberica;
    public static double numberOfCups;

    public void countRublePerGramArabica() {
        rublePerGramArabica = pricePerPurchaseArabica / weightInGramsArabica;

        System.out.println(" ");

        System.out.println("Название бренда арабики: " + brand);

        System.out.println("Стоимость за пачку: " + pricePerPurchaseArabica + "рублей");

        System.out.println("Грамм в пачке: " + weightInGramsArabica);

        System.out.println("Стоимость за грамм: " + rublePerGramArabica + "рублей");

        System.out.println();
    }

    public static void countRublePerGramRobusta() {
        rublePerGramRobusta = pricePerPurchaseRobusta / weightInGramsRobusta;

        System.out.println(" ");

        System.out.println("Название бренда робусты: " + brand);

        System.out.println("Стоимость за пачку: " + pricePerPurchaseRobusta + "рублей");

        System.out.println("Грамм в пачке: " + weightInGramsRobusta);

        System.out.println("Стоимость за грамм: " + rublePerGramRobusta + "рублей");

        System.out.println();
    }

    public static void countRublePerGramLiberica() {
        rublePerGramLiberica = pricePerPurchaseLiberica / weightInGramsLiberica;

        System.out.println(" ");

        System.out.println("Название бренда либерики: " + brand);

        System.out.println("Стоимость за пачку: " + pricePerPurchaseLiberica + "рублей");

        System.out.println("Грамм в пачке: " + weightInGramsLiberica);

        System.out.println("Стоимость за грамм: " + rublePerGramLiberica + "рублей");

        System.out.println();
    }

    public static void countMarginArabica() {
        priceWithMarginArabica = rublePerGramArabica * 1.3;
        System.out.println("Допустимая максимальная маржа для Арабики: " + priceWithMarginArabica);
            numberOfCups = (weightInGramsArabica / 9);
            revenueArabica = numberOfCups * priceWithMarginArabica * 200;
        }
    public static void countMarginRobusta() {
            priceWithMarginRobusta = rublePerGramRobusta * 1.3;
            System.out.println("Допустимая максимальная маржа для Робусты: " + priceWithMarginRobusta);
                numberOfCups = (weightInGramsRobusta / 9);
                revenueRobusta = numberOfCups * priceWithMarginRobusta * 200;
        }
    public static void countMarginLiberica() {
            priceWithMarginLiberica = rublePerGramLiberica * 1.3;
            System.out.println("Допустимая максимальная маржа для Либерики: " + priceWithMarginLiberica);
            numberOfCups = (weightInGramsLiberica / 9);
            revenueLiberica = numberOfCups * priceWithMarginLiberica * 200;
        }
}


