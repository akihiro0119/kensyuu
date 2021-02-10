package YearDays;

import java.util.Calendar;

class testCalendar2{
  public static void main(String args[]){

    Calendar calendar = Calendar.getInstance();

    System.out.println("現在の日時を設定します");
    dispCalendar(calendar);

    System.out.println("-- -- -- -- -- --");

    calendar.set(Calendar.YEAR, 2005);
    System.out.println("年を2005年に設定します");
    dispCalendar(calendar);

    System.out.println("-- -- -- -- -- --");

    calendar.set(2005, 10, 25); //月は0スタートのため11月は10と書く
    System.out.println("年月日を2005年11月25日に設定します");
    dispCalendar(calendar);

    System.out.println("-- -- -- -- -- --");

    calendar.set(2005, 10, 25, 14, 18);
    System.out.println("日時を2005年11月25日14時18分に設定します");
    dispCalendar(calendar);
  }

  private static void dispCalendar(Calendar calendar){
    String[] week_name = {"日曜日", "月曜日", "火曜日", 
                          "水曜日", "木曜日", "金曜日", "土曜日"};

    int year = calendar.get(Calendar.YEAR);
    int month = calendar.get(Calendar.MONTH) + 1;
    int day = calendar.get(Calendar.DATE);
    int hour = calendar.get(Calendar.HOUR_OF_DAY);
    int minute = calendar.get(Calendar.MINUTE);
    int second = calendar.get(Calendar.SECOND);
    int week = calendar.get(Calendar.DAY_OF_WEEK) - 1;

    System.out.println("設定されている日時は");
    System.out.println(year + "年" + month + "月" + day + "日");
    System.out.println("(" + week_name[week] + ")");
    System.out.println(hour + "時" + minute + "分" + second + "秒");
  }
}
