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


public class App {
    public static void main(String[] args) throws Exception {

            //カレンダークラスにより現在日時を取得
            Calendar c = Calendar.getInstance();

            // 日時のフォーマットを設定
            DateFormat myFormat = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss"); 

            // ファイル名を定義
            String FileName = "index" + myFormat.format(c.getTime());

            // 場所を定義し、csvに拡張子を変更
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

            BufferedWriter bw = new BufferedWriter(new FileWriter(newFile));
                                 // csvファイルにファイル書き込みをする宣言
                                 // ここでbwが始まっている

            String enter = System.getProperty("line.separator");
            // 環境に依存しない改行コードの定義
            

            if (args.length != 0){ //引数必ず１つであること

                File dir = new File(args[0]); //設定からフォルダを引数として受け取る
      
                File[] fileList = dir.listFiles(); //フォルダの中身を配列として格納
      
                    if(fileList != null){ //もしフォルダの中身が終わってないなら

                    for(int i = 0; i < fileList.length; i++){ // 繰り返し

                        try{
                            if
                            (fileList[i].getName().contains(".html")){//もし htmlを含むファイル名があるならば
                            
                            if(checkBeforewritefile(newFile)){ // もしcsvファイルに書き込みをするならば

                                

                                 bw.write(fileList[i].getName());

                                 bw.write("   ");
                                //フォルダから取得したhtmlを含むファイル名をcsvファイルに書き込み

                                System.out.println(fileList[i].getName() + "のファイル名を書き込みました");


                                 BufferedReader br = new BufferedReader(new FileReader(fileList[i]));
                                 // ファイルを読み込む準備

                                String line;
                                // String型を定義

                                String regex = "title";
                                // これを取得したいと定義

                                Pattern p = Pattern.compile(regex);
                                    // 定義した物をパターンと定義

                                boolean flg = true;
                                // trueをflgに代入

                                while((line = br.readLine()) != null){
                                    // 行がなくなるまで1行ずつ処理していく

                                     if (check(p,line)){
                                        // もしlineにパターンがヒットするなら

                                     bw.write(line + enter);
                                     //そのlineを書き込みと改行

                                     flg = false;
                                     // falseをflgに代入

                                     break;

                                     }

                                }

                                if(flg){
                                    // もしflgを処理するなら falseなら breakしないなら
                                bw.write("タイトル無し" + enter);
                                // タイトル無しを記述し改行
                                }
                                
                               
                               
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
                
            }bw.close();

        }

	private static boolean checkBeforewritefile(File newFile) {

        if(newFile.exists()){

            if(newFile.isFile() && newFile.canWrite()){

                return true;
            }
        }
        return false;
    }


    private static boolean check(Pattern p, String line) {

        Matcher m = p.matcher(line);

        if (m.find()){

            return true;

        }else{

            return false;
        }
    }

    
}

