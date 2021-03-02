import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class メイン {
  public static void main(String[] args) throws Exception {
    //カレンダークラスにより現在日時を取得
    Calendar c = Calendar.getInstance();
    // 日時のフォーマットを設定 
    DateFormat myFormat = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
    // 作成するファイル名を定義
    String FileName = "index" + myFormat.format(c.getTime());
    // 作成するファイルの保存場所を定義し、csvに拡張子を変更
    File newFile = new File("/Users/mono/tmp/" + FileName + ".csv");
  }

  // 環境に依存しない改行コードの定義
  String enter = System.getProperty("line.separator");

  // これを取得したいと定義
  String regex = "<title>(.*)</title>";
  // 定義した物をパターンと定義
  Pattern p = Pattern.compile(regex);
  

  private static boolean check(Pattern p, String line) {
    // マッチを定義 パターンがlineから見つかるか
    Matcher m = p.matcher(line);
    return m.find();
  }
}
