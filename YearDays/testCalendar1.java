package YearDays;

import java.util.Calendar;

class testCalendar1{
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

    
  }
}
