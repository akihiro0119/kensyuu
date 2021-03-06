import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class csv {
  public static void main(String[] args) throws Exception {
    //カレンダークラスにより現在日時を取得
    Calendar c = Calendar.getInstance();
    // 日時のフォーマットを設定 
    DateFormat myFormat = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
    // 作成するファイル名を定義
    String FileName = "index" + myFormat.format(c.getTime());
    // 作成するファイルの保存場所を定義し、csvに拡張子を変更
    File newFile = new File("/Users/mono/tmp/" + FileName + ".csv"); 
        //ファイル作成が上手くいくかどうか
        try{
            //上手くいったなら作成したファイル名と状態をコマンドラインに表示
            if(newFile.createNewFile()){
                System.out.println(FileName + "のファイルの作成に成功");
            //上手くいかなかったらコマンドラインに失敗と表示
            }else{
                System.out.println("ファイルの作成に失敗");
            }
        }catch(IOException e){
            System.out.println(e);
        }
  }
}
