import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
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

            // フォルダを指定
            File dir = new File("/Users/mono/tmp");


            // フォルダの中身をlistと定義
            File[] list = dir.listFiles();

            //　htmlファイルのみをフォルダの中から抽出 どのファイルが結果として取得出来てれば良いのかの確認のためにもターミナルに一度出力をしておきたい

            for(int i = 0; i<list.length; i++){
                if(list[i].getName().contains(".csv")){ //あとで.htmlに変更する
                    System.out.println(list[i].getName());

                }else{
                    //何もしない
                }
            }
            // フォルダのフルパスをCSVファイルに書き写す 先頭に書けるのであれば後から入力しても良い

            if(checkBeforewritefile(newfile)){
                FileWriter fw =  new FileWriter(newfile);

                fw.write("/Users/mono/tmp"); //フルパス
                System.out.println("フルパスを書き込みました！");

                fw.close(); 
            }else{
                System.out.println("書き込めません");
            }

            //　対象のディレクトリ内のファイルを開く

            // if文でタイトルを正規表現で取得

            // タイトルをCSVファイルに書き写す　
    }

	private static boolean checkBeforewritefile(File fileName) {
        if(fileName.exists()){
            if(fileName.isFile() && fileName.canWrite()){
                return true;
            }
        }
        return false;
    }

    private static boolean cheakBeforeReadfile(File file) {
        
		return false;
	}
}
