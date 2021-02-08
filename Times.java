import java.util.Scanner;
import java.util.*;

public class Times{
  public static void main(String[] args){
    Scanner k = new Scanner (System.in); //キーボードの入力

  Calendar now = Calendar.getInstance(); //現在の日付を取得

  Calendar calBirth = Calendar.getInstance(); //入力された物をカレンダーで取得

  System.out.println("あなたの生まれた年を西暦で教えて下さい");
  int yy = k.nextInt();

  System.out.println("あなたの生まれた月を教えてください");
  int mm = k.nextInt();

  System.out.println("あなたの生まれた日を教えてください");
  int dd = k.nextInt();

  System.out.println(yy + "年" + mm + "月" + dd + "日ですね");

  k.close();

  int y = now.get(Calendar.YEAR);
  int m = now.get(Calendar.MONTH) + 1;
  int d = now.get(Calendar.DATE);
  System.out.println("現在は" + y + "年" + m + "月" + d + "日ですので");

  calBirth.set(yy, mm-1, dd, 0, 0, 0); // 年・月・日・時・分・秒
  now.set(y, m-1, d, 0, 0, 0);

  long difference = (now.getTimeInMillis() - calBirth.getTimeInMillis())/(1000 * 60 * 60 * 24 );
  // 現在の日付　引く　生まれた日付　を行い
  // 0.001秒 * 1000 * 60 * 60 * 24 で日換算

  System.out.println("あなたが生まれてから" + difference + "日です" );
  }
}

