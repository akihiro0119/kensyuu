package YearDays;

import java.util.Calendar;

class testCalendar3{
  public static void main(String args[]){

    Calendar calendar = Calendar.getInstance();

    System.out.println("日時を2005/12/30に設定します");
    calendar.set(2005, 11, 30);
    dispCalendar(calendar);

    System.out.println("-- -- -- -- -- --");

    System.out.println("日を1ずつ増加させます");
    for (int i = 0 ; i < 6 ; i++){
      calendar.add(Calendar.DAY_OF_MONTH, 1);
      dispCalendar(calendar);
    }

    System.out.println("-- -- -- -- -- --");

    System.out.println("日時を2006/1/31に設定します");
    calendar.set(2006, 0, 31);
    dispCalendar(calendar);

    System.out.println("-- -- -- -- -- --");

    System.out.println("月を1ずつ増加させます");
    for (int i = 0 ; i < 4 ; i++){
      calendar.add(Calendar.MONTH, 1);
      dispCalendar(calendar);
    }
  }

  private static void dispCalendar(Calendar calendar){
    int year = calendar.get(Calendar.YEAR);
    int month = calendar.get(Calendar.MONTH) + 1;
    int day = calendar.get(Calendar.DATE);

    StringBuffer sb = new StringBuffer();
    sb.append("設定されている日時は");
    sb.append(year + "年" + month + "月" + day + "日");
    sb.append("です。");

    System.out.println(new String(sb));
  }
}
