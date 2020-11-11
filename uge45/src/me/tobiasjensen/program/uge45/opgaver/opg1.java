package me.tobiasjensen.program.uge45.opgaver;

import java.time.LocalDate;
import java.time.Period;

public class opg1 {

    public static void howOld(int myBirthYear) {
        LocalDate bMo = LocalDate.of(myBirthYear, 11, 21);
        LocalDate now = LocalDate.now();
        Period diff = Period.between(bMo, now );
        System.out.println("Jeg er " + diff.getYears() + " år gammel ");

    }
}
