public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Задача 1");
        int attachment = 15000;
        int total = 0;
        int month = 1;
        while (total < 2459000) {
            total = total + attachment;
            System.out.println("Месяц " + month + ", сумма накоплений " + total + " рублей");
            month = month + 1;
        }
        System.out.println();
        System.out.println("Задача 2");
        int number = 1;
        while (number <= 10) {
            System.out.print(number + " ");
            number = number + 1;
        }
        System.out.println();
        for (number = 10; number >= 1; number = number - 1) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println("Задача 3");
        int population = 12000000;
        int birthRate = 17;
        int mortality = 8;
        int year = 1;
        while (year <= 10) {
            population = population + ((birthRate - mortality) * population / 1000);
            System.out.println("Год " + year + ", численность населения составляет " + population);
            year = year + 1;
        }
        System.out.println();
        System.out.println("Задача 4");
        int contribution = 15000;
        month = 1;
        total = 0;
        while (total <= 12000000) {
            total = total + (total / 100 * 7) + contribution;
            System.out.println("Месяц " + month + ", накопление составляет " + total + " рублей");
            month = month + 1;
        }
        System.out.println();
        System.out.println("Задача 5");
        contribution = 15000;
        month = 1;
        total = 0;
        while (total <= 12000000) {
            total = total + (total / 100 * 7) + contribution;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", накопление составляет " + total + " рублей");
            }
            month = month + 1;
        }
        System.out.println();
        System.out.println("Задача 6");
        contribution = 15000;
        month = 1;
        total = 0;
        while (month < (12 * 9)) {
            total = total + (total / 100 * 7) + contribution;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", накопление составляет " + total + " рублей");
            }
            month = month + 1;
        }
        System.out.println();
        System.out.println("Задача 7");
        int friday = 4;
        int dayInMonth = 31;
        while (friday <= dayInMonth) {
            System.out.println("Сегодня пятница,"+ friday + "-е число. Необходимо подготовить отчет");
            friday = friday + 7;
        }
        System.out.println();
        System.out.println("Задача 8");
        year = 2024;
        int yearsBefore = year - 200;
        int yearsAfter = year + 100;
        int periodicity = 79;
        for (int yearsFly = 0; yearsFly < yearsAfter; yearsFly = yearsFly + 1) {
            if (yearsFly > yearsBefore && yearsFly % periodicity == 0) {
                System.out.println(yearsFly);
            }
        }
    }
}
