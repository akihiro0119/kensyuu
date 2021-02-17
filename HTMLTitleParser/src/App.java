import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
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
            File dir = new File("ここに入れる");


            // フォルダの中身をlistと定義
            File[] list = dir.listFiles();

            //　htmlファイルのみをフォルダの中から抽出 どのファイルが結果として取得出来てれば良いのかの確認のためにもターミナルに一度出力をしておきたい

            for(int i = 0; i<list.length; i++){
                if(list[i].getName().contains(".html")){ //あとで.htmlに変更する
                    System.out.println(list[i].getName());
// 配列に組み込むコード
                }else{
                    //何もしない
                }
            }
            // フォルダのフルパスをCSVファイルに書き写す 先頭に書けるのであれば後から入力しても良い

            if(checkBeforewritefile(newfile)){
                FileWriter fw =  new FileWriter(newfile);

                fw.write(""); //ファイル名
                fw.write(""); //タイトルを書き足す
                System.out.println("フルパスを書き込みました！");

                fw.close(); 
            }else{
                System.out.println("書き込めません");
            }



            File folder = new File("/Users/mono/tmp");

            // 小テスト　フォルダ内の一つのファイルを指定
        try{

            File file = new File("/Users/mono/tmp/html.html"); //ファイルを指定

             // ファイルが存在しない場合に例外が発生するので確認する
                if (!file.exists()) {
                    System.out.print("ファイルが存在しません");
                    return;
                }

            //　小テスト　ファイルを１行ずつ読む
            FileReader filereader = new FileReader(file);

            BufferedReader br = new BufferedReader(filereader);

            String line;
            while((line = br.readLine()) != null) System.out.println(line);
            br.close();
            } catch (FileNotFoundException e){
                e.printStackTrace();
                System.exit(-1); // 0 以外は異常終了
            } catch (IOException e){
                e.printStackTrace();
                System.exit(-1);
            }
        }



	private static boolean checkBeforewritefile(File fileName) {
        if(fileName.exists()){
            if(fileName.isFile() && fileName.canWrite()){
                return true;
            }
        }
        return false;
    }
    
}
