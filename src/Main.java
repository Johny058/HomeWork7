// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Привет мир");
        System.out.println("Задача № 1");
        int salary = 15_000;
        int total = 0;
        while (total < 2_449_000) {
            total = total + salary;
            int i = total / salary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total);
        }
        System.out.println("Задача № 2");
        int num = 0;
        while (num < 10) {
            num++;
            System.out.print(num + " ");
        }
        System.out.println();
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println("Задача № 3");
        int countryY = 12_000_000;
        int totalCountryY = 0;
        for (int i = 1; i <= 10; i++) {
            int birthRateOfThePopulation = countryY / 1000 * 17;
            int mortalityOfThePopulation = countryY / 1000 * 8;
            int populationGrowth = (birthRateOfThePopulation - mortalityOfThePopulation) + countryY + totalCountryY;
            System.out.println("Год " + i + " численость населения составляет " + populationGrowth);
        }
        System.out.println("Задача 4");
        int amountPurpose = 12_000_000;
        int depositAmount = 15000;
        double monthlyPercent = 0.07;
        int month = 1;

        while (depositAmount <= amountPurpose) {
            depositAmount += depositAmount * monthlyPercent;

            System.out.printf("Месяц %d, сумма накоплений: %d%n", month, depositAmount);
            month++;
        }
        System.out.println("Задача 5");
        int amountPurpose1 = 12_000_000;
        float depositAmount1 = 15_000;
        int monthlyPercent1 = 7;

        for (int month1 = 1; depositAmount1 < amountPurpose1; month1++) {
            depositAmount1 += depositAmount1 * monthlyPercent1 / 100;
            if (month1 % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений: %.2f \n", month1, depositAmount1);
            }
        }
        System.out.println("Задача 6");
        int year = 9;
        int monthInYear = year * 12;
        float total5 = 15000;
        int percent = 7;
        for (int month2 = 1; month2 <= monthInYear; month2++) {
            total5 += total5 * percent / 100;
            if (month2 % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений %.2f \n", month2, total5);
            }
        }
        System.out.println("Задача 7");
        int friday = 5;
        int dayInMonth = 31;
        for (; friday < dayInMonth; friday += 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
        }
        System.out.println("Задача 8");
        int frequency = 79;
        int currentYear = 2023;
        int beforeYear = currentYear - 200;
        int afterYear = currentYear + 100;
        for (int year1 = 0; year1 < afterYear; year1 += frequency) {
            if (year1 > beforeYear) {
                System.out.println(year1);
            }
        }


    }
}


