package me.tobiasjensen.program.uge45.opgaver;

import java.util.Calendar;

public class opg2 {

    public static void howOldinMonths() {
        Calendar now = Calendar.getInstance();
        int month = (now.get(Calendar.MONTH)+1);
        int res = month+((18)-1)*12;
        System.out.println(res);
    }
}
