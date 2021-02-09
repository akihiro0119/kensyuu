package YearDays;

import java.util.Calendar;

class testCalendar5{
  public static void main(String args[]){

    Calendar calendar1 = Calendar.getInstance();

    System.out.println("日時1を2006/05/08 09:45:10に設定します");
    calendar1.clear();
    calendar1.set(2006, 4, 8, 9, 45, 10);
    long millis1 = calendar1.getTimeInMillis();
    System.out.println("エポックからの経過ミリ秒の値は" + millis1 + "です");

    Calendar calendar2 = Calendar.getInstance();

    System.out.println("日時2を2006/05/11 12:58:15に設定します");
    calendar2.clear();
    calendar2.set(2006, 4, 11, 12, 58, 15);
    long millis2 = calendar2.getTimeInMillis();
    System.out.println("エポックからの経過ミリ秒の値は" + millis2 + "です");

    long diff = millis2 - millis1;
    System.out.println("日時の差は" + diff  + "ミリ秒です");

    diff = diff / 1000;    /* 秒以下切捨て */

    long se = diff % 60;
    diff = diff / 60;

    long mi = diff % 60;
    diff = diff / 60;

    long ho = diff % 24;
    long day = diff / 24;

    System.out.println(day + "日と" + ho + "時" + mi + "分" + se + "秒");
  }
}
