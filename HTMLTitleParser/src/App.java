import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.Closeable; 


public class App {
    public static void main(String[] args) throws Exception {

            //カレンダークラスにより現在日時を取得
            Calendar c = Calendar.getInstance();

            // 日時のフォーマットを設定
            DateFormat myFormat = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss"); 

            // ファイル名を定義

            String FileName = "index" + myFormat.format(c.getTime());

            // 
            File newFile = new File("/Users/mono/tmp/" + FileName + ".csv");
            

            try{
                if(newFile.createNewFile()){
                    System.out.println(FileName + "のファイルの作成に成功");
                }else{
                    System.out.println("ファイルの作成に失敗");
                }
            }catch(IOException e){
                System.out.println(e);
            }

            // フォルダを指定
            

            if (args.length != 0){ //引数必ず１つであること

                File dir = new File(args[0]); //設定からフォルダを引数として受け取る
      
                File[] fileList = dir.listFiles(); //フォルダの中身を配列として格納
      
                    if(fileList != null){ //もしフォルダの中身が終わってないなら

                    for(int i = 0; i < fileList.length; i++){ //繰り返し処理をします

                        try{
                            if
                            (fileList[i].getName().contains(".html")){//もし html　を含むファイル名があるならば
                            
                            if (checkBeforewritefile(newFile)){ // もしcsvファイルに書き込みをするならば

                                BufferedWriter bw = new BufferedWriter(new FileWriter(newFile));
                                 // csvファイルにファイル書き込みをする宣言

                                // BufferedReader br = new BufferedReader(new FileReader(fileList[i]));
                                 // ファイルを読み込む準備

                                //　String line;
                                // String型を定義

                                    // while((line = br.readLine()) != null);
                                    // 行がなくなるまで1行ずつ処理していく

                                    // String regex =" <(title)>.*?<\\>";
                                    // これを取得したいと定義

                                    // Pattern p = Pattern.compile(regex);
                                    // 定義した物をパターンと定義

                                    // check(p,line);
                                    // 1行ずつパターンがないかチェック

                                System.out.println(fileList[i].getName() + "のファイル名を書き込みました");

                                bw.write(fileList[i].getName()); //フォルダから取得したhtmlを含むファイル名をcsvファイルに書き込み

                                bw.close();
                            }
                               
                            }else{
                                System.out.println("書き込めませんでした");
                            }
                        }catch(IOException e){
                         System.out.println(e);
                        }finally{

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

    private static void check(Pattern p, String line) {
        Matcher m = p.matcher(line);

        if (m.find()){
            //　バッファ　取得したタイトル　で書き込み
        }else{
            // バッファ　タイトルなし　で書き込み
        }
    }
    
}
