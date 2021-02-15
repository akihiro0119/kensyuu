import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class App {
    public static void main(String[] args) throws Exception {

        //カレンダークラスにより現在日時を取得
        Calendar c = Calendar.getInstance();

        // 日時のフォーマットを設定
        DateFormat myFormat = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss"); 
        
        // フォルダを指定

        // フォルダの中身を確認

        // ファイル名を定義
        String FileName = myFormat.format(c.getTime());
        File newfile = new File("/Users/mono/tmp/index" + FileName + ".csv");
        try{
            if(newfile.createNewFile()){
                System.out.println("ファイルの作成に成功");
            }else{
                System.out.println("ファイルの作成に失敗");
            }
        }catch(IOException e){
            System.out.println(e);
        }

        // フォルダのフルパスをCSVファイルに書き写す

        // フォルダの中のファイルを開く　＊１　for文で繰り返し

        // if文でタイトルを正規表現で取得

        // タイトルをCSVファイルに書き写す　*１に戻る
    }
}
