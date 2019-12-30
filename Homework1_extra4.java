import java.util.Scanner;

public class Homework1_extra4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // необходимо вывести на консоль дату следующего дня
        int day, month, year;
        System.out.print("Введите сегодняшнее число: ");
        day = in.nextInt();
        System.out.print("Введите номер сегодняшнего месяца: ");
        month = in.nextInt();
        System.out.print("Введите сегодняшний год: ");
        year = in.nextInt();
        int dayNext, monthNext, yearNext;
        int year366 = 0;
        if ((year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0)))
            year366 = year;
        if (((month == 4) || (month == 6) || (month == 9) || (month == 11)) && (day == 30))
            dayNext = 1;
        else if ((year != year366) && (month == 2) && (day == 28))
            dayNext = 1;
        else if ((year == year366) && (month == 2) && (day == 28))
            dayNext = 29;
        else if ((year == year366) && (month == 2) & (day == 29))
            dayNext = 1;
        else if (day == 31)
            dayNext = 1;
        else
            dayNext = day + 1;
        if ((month == 12) && (dayNext == 1)) {
            monthNext = 1;
            yearNext = year + 1;
        }
        else if (dayNext == 1) {
            monthNext = month + 1;
            yearNext = year;
        }
        else {
            monthNext = month;
            yearNext = year;
        }
        System.out.println("Сегодня: "+day+" "+month+" "+year+".");
        System.out.println("Завтра: "+dayNext+" "+monthNext+" "+yearNext+'.');
    }
}
