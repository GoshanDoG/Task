public class Main {
    public static void main(String[] args) {

        Rent firstPlace = new Rent();
        Rent secondPlace = new Rent();

        System.out.println(" ");
        System.out.println("*Начинаем подсчеты по нашему маленькому ИП: ");
        System.out.println(" ");
        System.out.println("Начнем с выбора дислокации и рассмотрим два варианта");

        firstPlace.district = "Ульянка";
        firstPlace.address = "Генерала Симоняка 4 к1";
        firstPlace.rentPerMonth = 14000;
        firstPlace.showRentInformation();

        secondPlace.district = "Адмиралтейский";
        secondPlace.address = "Проспект Римского-Корсакова 14";
        secondPlace.rentPerMonth = 33000;
        secondPlace.showRentInformation();

        System.out.println(" ");
        System.out.println(firstPlace.rentPerMonth < secondPlace.rentPerMonth ? "*На Проспекте Римского-Корсакова дороже аренда но больше проходимость, выбираем Адмиралтейский район" : "Если в адмиралтейском районе еще и дешевле будет, то лучше варианта я вообше не вижу");
        System.out.println(" ");
        System.out.println("*ПОДСЧЁТЫ ПО РЕНТЕ ЗАВЕРШЕНЫ*");

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        Coffee arabica = new Coffee();

        System.out.println(" ");
        System.out.println("*Наш доход будет считаться от продаж кофе");
        System.out.println("*Закупкой молока и стаканчиков пренебрежём");

        Coffee.brand = "lavazza Qualita Oro";
        Coffee.weightInGramsArabica = 1000;
        Coffee.pricePerPurchaseArabica = 1189;
        arabica.countRublePerGramArabica();
        Coffee.countMarginArabica();

        Coffee.brand = "lavazza Qualita Oro";
        Coffee.weightInGramsRobusta = 1000;
        Coffee.pricePerPurchaseRobusta = 1400;
        Coffee.countRublePerGramRobusta();
        Coffee.countMarginRobusta();

        Coffee.brand = "India Anohki Coffe";
        Coffee.weightInGramsLiberica = 900;
        Coffee.pricePerPurchaseLiberica = 1125;
        Coffee.countRublePerGramLiberica();
        Coffee.countMarginLiberica();


        System.out.println(" ");
        System.out.println("*ПОДСЧЁТЫ ПО КОФЕ ЗАВЕРШЕНЫ*");

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        Employees barista = new Employees();
        Employees cleaner = new Employees();

        barista.nameAndSurname = "Владимир Епифанцев";
        barista.jobTitle = "Бариста";
        barista.daySalary = 1700;
        barista.daysOnTheWork = 20;
        barista.countMonthlySalary();

        cleaner.nameAndSurname = "Сергей Пахомов";
        cleaner.jobTitle = "Уборщик";
        cleaner.daySalary = 1200;
        cleaner.daysOnTheWork = 4;
        cleaner.countMonthlySalary();

        System.out.println(" ");
        System.out.println("*В принципе работнички неплохие, но немного странные");
        System.out.println(" ");
        System.out.println("*ПОДСЧЁТЫ ПО РАБОТНИКАМ ЗАВЕРШЕНЫ*");

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println(" ");
        Profit.countExpencesPerMonth(secondPlace.rentPerMonth, barista.salaryPerMonth + cleaner.salaryPerMonth);
        System.out.println("Суммарная прибыль от продажи кофе за месяц: " + (Coffee.revenueArabica + Coffee.revenueRobusta + Coffee.revenueLiberica));
        Profit.countProfitPerMonth(Coffee.revenueArabica, Coffee.revenueRobusta, Coffee.revenueLiberica);
        System.out.println (Profit.profit > 0 ? "Поздравляю, мы вышли в плюс, но нам ещё есть над чем подумать для максимилизации прибыли" : "К сожалению мы вышли в минус, надо пересмотреть нашу стратегию");

        System.out.println(" ");
        System.out.println("*ПОДСЧЁТЫ ПО ПРИБЫЛИ ЗАВЕРШЕНЫ, СПАСИБО ЗА ВНИМАНИЕ!*");
    }
}
