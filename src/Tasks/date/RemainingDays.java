package Tasks.date;

import java.util.Calendar;
import java.util.Date;

public class RemainingDays {
    int year = 0;
    int month = 0;
    int date = 0;
    int hourOfDay = 0;
    int minute = 0;
    int second = 0;
    int resultRemainingDays = 0;

    public RemainingDays(int year, int month, int date, int hourOfDay, int minute, int second) {
        this.year = year;
        this.month = month;
        this.date = date;
        this.hourOfDay = hourOfDay;
        this.minute = minute;
        this.second = second;
        Calendar calendar = Calendar.getInstance();
        calendar.set(this.year, month, date, hourOfDay, minute, second);
        Date yearStartTime = calendar.getTime();

        Calendar calendar1 = Calendar.getInstance();
        calendar1.getTime();
        Date currentTime = calendar1.getTime();

        long day = 24 * 60 * 60 * 1000;
        long timeDistance = currentTime.getTime() - yearStartTime.getTime();
        //System.out.println((int) (timeDistance / day));
        resultRemainingDays = (int) (timeDistance / day);
        //System.out.println(resultRemainingDays);
    }

    public static void getDifferenceInDays(RemainingDays date1, RemainingDays date2) {
        System.out.println(date1.resultRemainingDays - date2.resultRemainingDays);
    }

    public static int getDifferenceInDays1(RemainingDays date1, RemainingDays date2) {
        return date1.resultRemainingDays-date2.resultRemainingDays;
    }
}
