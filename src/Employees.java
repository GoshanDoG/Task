public class Employees {
    public String nameAndSurname;
    public String jobTitle;
    public int daySalary;
    public double salaryPerMonth;
    public int daysOnTheWork;


    public void countMonthlySalary() {
        salaryPerMonth = daysOnTheWork * daySalary;

        System.out.println(" ");

        System.out.println("Должность: " + jobTitle);

        System.out.println("Имя и фамилия: " + nameAndSurname);

        System.out.println("Дней за месяц отработано: " + daysOnTheWork);

        System.out.println("заработано за месяц: " + salaryPerMonth);
    }
}
