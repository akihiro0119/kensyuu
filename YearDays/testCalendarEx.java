package YearDays;

import java.util.Calendar;

public class testCalendarEx {
  
  public static void main(String args[]){

    String[] week_name = {"日曜日", "月曜日", "火曜日", "水曜日", 
                          "木曜日", "金曜日", "土曜日"};

    Calendar c = Calendar.getInstance();

    int year = c.get(Calendar.YEAR);
    int month = c.get(Calendar.MONTH) + 1;
    int day = c.get(Calendar.DATE);
    int hour = c.get(Calendar.HOUR_OF_DAY);
    int minute = c.get(Calendar.MINUTE);
    int second = c.get(Calendar.SECOND);
    int week = c.get(Calendar.DAY_OF_WEEK) - 1;

    int day_of_year = c.get(Calendar.DAY_OF_YEAR);

    System.out.println("現在の日時は");
    System.out.println(year + "年" + month + "月" + day + "日");
    System.out.println("(" + week_name[week] + ")");
    System.out.println(hour + "時" + minute + "分" + second + "秒");

    System.out.println("今日は今年の" + day_of_year + "日目です");

    System.out.println("");
    for (int i = 0 ; i < 10 ; i++){
    c.add(Calendar.DAY_OF_MONTH, 10000);
      dispCalendar(c);
    //10000日後を出力しようとするとカレンダー通りにならない
    }
  }

  private static void dispCalendar(Calendar c) {

    String[] week_name2 = {"日曜日", "月曜日", "火曜日", "水曜日", 
                          "木曜日", "金曜日", "土曜日"};

    int year2 = c.get(Calendar.YEAR);
    int month2 = c.get(Calendar.MONTH) + 1;
    int day2 = c.get(Calendar.DATE);
    int hour2 = c.get(Calendar.HOUR_OF_DAY);
    int minute2 = c.get(Calendar.MINUTE);
    int second2 = c.get(Calendar.SECOND);
    int week2 = c.get(Calendar.DAY_OF_WEEK) - 1;

    //年・月・日・時間・分・秒・曜日を出力できるよう変数に格納

    int day_of_year2 = c.get(Calendar.DAY_OF_YEAR);

    //今年が始まってから何日を出力できるよう格納

    System.out.println("-- -- -- -- -- --");

    System.out.println("10000日後の日時は");
    System.out.println(year2 + "年" + month2 + "月" + day2 + "日");
    System.out.println("(" + week_name2[week2] + ")");
    System.out.println(hour2 + "時" + minute2 + "分" + second2 + "秒");
    System.out.println("その日は" + year2 + "年の" + day_of_year2 + "日目です");
  }
}
