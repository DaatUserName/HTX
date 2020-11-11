package me.tobiasjensen.program.uge45.opgaver;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class opg3 {

    public static void getDaysinMonth() {
        Scanner input = new Scanner(System.in);

        int number_Of_DaysInMonth = 0;
        String MonthOfName = "Ukendt";
        System.out.print("Skriv et nummer mellem 1 og 12: ");

        int month = input.nextInt();
        System.out.print("Skriv årstal: ");

        int year = input.nextInt();

        switch (month) {
            case 1:
                MonthOfName = "Januar";
                number_Of_DaysInMonth = 31;
                break;
            case 2:
                MonthOfName = "Februar";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    number_Of_DaysInMonth = 29;
                } else {
                    number_Of_DaysInMonth = 28;
                }
                break;
            case 3:
                MonthOfName = "Mars";
                number_Of_DaysInMonth = 31;
                break;
            case 4:
                MonthOfName = "April";
                number_Of_DaysInMonth = 30;
                break;
            case 5:
                MonthOfName = "Maj";
                number_Of_DaysInMonth = 31;
                break;
            case 6:
                MonthOfName = "Juni";
                number_Of_DaysInMonth = 30;
                break;
            case 7:
                MonthOfName = "Juli";
                number_Of_DaysInMonth = 31;
                break;
            case 8:
                MonthOfName = "August";
                number_Of_DaysInMonth = 31;
                break;
            case 9:
                MonthOfName = "September";
                number_Of_DaysInMonth = 30;
                break;
            case 10:
                MonthOfName = "Oktober";
                number_Of_DaysInMonth = 31;
                break;
            case 11:
                MonthOfName = "November";
                number_Of_DaysInMonth = 30;
                break;
            case 12:
                MonthOfName = "December";
                number_Of_DaysInMonth = 31;
        }
        input.close();
        System.out.print(MonthOfName + " " + year + " har " + number_Of_DaysInMonth + " dage\n");
    }

    public static void countDays() {
        String date1 = "2020-05-24";
        String date2 = "2020-07-29";

        boolean found = true;


        while(found) {
            System.out.println("Beregner....");
            LocalDate dateBefore = LocalDate.parse(date1);
            LocalDate dateAfter = LocalDate.parse(date2);

            long noOfDaysBetween = ChronoUnit.DAYS.between(dateBefore, dateAfter);

            found = false;
            System.out.println(noOfDaysBetween + " dage");
        }
    }
}