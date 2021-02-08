import java.util.Calendar;

class testCalendar4{
  public static void main(String args[]){

    Calendar calendar1 = Calendar.getInstance();

    System.out.println("日時1を2006/05/08 09:45:10に設定します");
    calendar1.set(2006, 4, 8, 9, 45, 10);

    Calendar calendar2 = Calendar.getInstance();

    System.out.println("日時2を2006/05/11 12:58:15に設定します");
    calendar2.set(2006, 4, 11, 12, 58, 15);

    int diff = calendar1.compareTo(calendar2);

    if (diff == 0){
      System.out.println("日付1と日付2は同じ日時です");
    }else if (diff > 0){
      System.out.println("日付1は日付2より進んでいます");
    }else{
      System.out.println("日付1は日付2より遅れています");
    }
  }
}
