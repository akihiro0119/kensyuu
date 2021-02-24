import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.regex.Pattern;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.regex.Matcher;

public class App {

    public static void main(String[] args) throws Exception {
        // void型でmainを定義
    
        Calendar c = Calendar.getInstance();
        //カレンダークラスにより現在日時を取得
        
        DateFormat myFormat = new SimpleDateFormat("_yyyy_MM_dd_HH_mm_ss");
        // 日時のフォーマットを設定 

        String FileName = "index" + myFormat.format(c.getTime());
        // FileNameにファイルネームを定義
        
        File newFile = new File("/Users/mono/tmp/" + FileName + ".csv");
        // Fileを/Users/mono/tmp/FileName.csvで作成

        try{

            if(newFile.createNewFile()){
                // もしファイル作成できたら
                System.out.println(FileName + "のファイルの作成に成功");
                // 上記の文章をコマンドラインに表示
            }else{
                // ファイル作成出来ていなかったら
                System.out.println("ファイルの作成に失敗");
                //　上記の文章をコマンドラインに表示
            }

        }catch(IOException e){
            
            System.out.println(e);
        
        }

        if (args.length != 0){
            // 引数の数が0+１個だったら

            File dir = new File(args[0]);
            // 引数に設定してあるフォルダをdirに定義

            File[] fileList = dir.listFiles();
            // fileListにフォルダ内のファイルを配列として格納

            for(int i = 0; i < fileList.length; i++){
                // fileListの数だけ処理を繰り返す
                
                if(fileList[i].getName().contains(".html")){
                    // .html拡張子のファイル名を取得
                    
                    if(checkBeforewritefile(newFile)){
                        
                        BufferedWriter bw = new BufferedWriter(new FileWriter(newFile));
                        // newFileにまとめて書き込む準備をバッファでする。
                        
                        bw.write(fileList[i].getName());
                        // 処理中のfileListの名前をnewFileに書き込む

                        bw.close();
                        // 1行の処理のため一度閉じる

                        System.out.println(fileList[i].getName() + "のファイル名を書き込みました");
                        // 書き込めた場合この文章をコマンドラインに表示
                    }
                    
                    else{
                        System.out.println("書き込めませんでした");
                    }
                }
            }

        }
        
    }

    private static boolean checkBeforewritefile(File newFile) {
        if(newFile.exists()){
            if(newFile.isFile() && newFile.canWrite()){
                return true;
            }
        }
        return false;
    }
}

