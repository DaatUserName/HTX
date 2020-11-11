package me.tobiasjensen.program.uge45;


import me.tobiasjensen.program.uge45.opgaver.opg1;
import me.tobiasjensen.program.uge45.opgaver.opg2;
import me.tobiasjensen.program.uge45.opgaver.opg3;

public class Main {

    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("Opgave 1: ");
        opg1.howOld(2001);

        System.out.println(" ");
        System.out.println("Opgave 2: ");
        opg2.howOldinMonths();

        System.out.println(" ");
        System.out.println("Opgave 3: ");
        opg3.getDaysinMonth();
        System.out.println(" ");
        System.out.println("Del 2:");
        System.out.println(" ");
        opg3.countDays();
    }
}
