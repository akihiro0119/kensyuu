import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Day {
  public static void main(String[] args){

    Date now = new Date();
    Calendar c = Calendar.getInstance();

    c.setTime(now);

    int day = c.get(Calendar.DAY_OF_MONTH);

    SimpleDateFormat fc =
      new SimpleDateFormat("西暦y年M月d日");
      

    day += 100;
    c.set(Calendar.DAY_OF_MONTH, day);

    Date future = c.getTime();
    
    SimpleDateFormat f =
      new SimpleDateFormat("100日後の西暦y年M月d日");

    System.out.println(fc.format(now));
    System.out.println(f.format(future));
  }
}
