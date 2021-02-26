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

            
            Calendar c = Calendar.getInstance();
            //カレンダークラスにより現在日時を取得

            DateFormat myFormat = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
            // 日時のフォーマットを設定 

            String FileName = "index" + myFormat.format(c.getTime());
            // 作成するファイル名を定義

            File newFile = new File("/Users/mono/tmp/" + FileName + ".csv");
            // 作成するファイルの保存場所を定義し、csvに拡張子を変更
            

            try{
                //ファイル作成が上手くいくかどうか
                if(newFile.createNewFile()){

                    System.out.println(FileName + "のファイルの作成に成功");
                    //上手くいったなら作成したファイル名と状態をコマンドラインに表示
                }else{

                    System.out.println("ファイルの作成に失敗");
                    //上手くいかなかったらコマンドラインに失敗と表示
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
                            (fileList[i].getName().contains(".html")){
                                //もし htmlを含むファイル名があるならば
                            
                            if(checkBeforewritefile(newFile)){ 
                                // もしcsvファイルに書き込みをするならば

                                 bw.write(fileList[i].getName());
                                 // 処置中のhtmlファイル名を書き込み

                                 bw.write("   ");
                                //半角3つ分の空白を書き込み

                                System.out.println(fileList[i].getName() + "のファイル名を書き込みました");
                                // 書き込みが出来たことをコマンドラインで表示


                                 BufferedReader br = new BufferedReader(new FileReader(fileList[i]));
                                 // ファイルを読み込む準備

                                String line;
                                // String型を定義

                                String regex = "<title>(.*)</title>";
                                // これを取得したいと定義

                                Pattern p = Pattern.compile(regex);
                                    // 定義した物をパターンと定義

                                boolean flg = true;
                                // trueをflgに代入

                                while((line = br.readLine()) != null){
                                    // 行がなくなるまで1行ずつ処理していく

                                     if (check(p,line)){
                                        // もしlineにパターンがヒットするなら

                                        line = line.replace("<title>" , "");
                                        line = line.replace("</title>", "");
                                        // titleとその閉じタグを消す

                                     bw.write(line + enter);
                                     //lineを書き込みと改行

                                     flg = false;
                                     // falseをflgに代入

                                     break;
                                     // nullになる前に処理を終了

                                     }

                                }

                                if(flg){
                                    // もしflgを処理するなら falseなら breakしないなら
                                bw.write("タイトル無し" + enter);
                                // タイトル無しを記述し改行
                                }
                                
                            }
                               
                            }else{
                                System.out.println(fileList[i].getName() + "はHTMLではありません");
                                // htmlファイル以外の場合はファイル名と上記をコマンドラインに表示

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
        // 作成したcsvファイルが存在するかのチェック

        if(newFile.exists()){   
            // `もしファイルがあるならば

            if(newFile.isFile() && newFile.canWrite()){
                // そのファイルが書き込み可能ならば処理を続行

                return true;
            }
        }
        return false;
        // ファイルが作成できてないならfalseを返して処理を止める
    }


    private static boolean check(Pattern p, String line) {
        // 正規表現のチェック

        Matcher m = p.matcher(line);
        // マッチを定義 パターンがlineから見つかるか

        if (m.find()){
            // もしマッチが見つかるなら

            return true;
            // trueを返す

        }else{
            // マッチが見つからないなら

            return false;
            // falseを返す
        }
    }

    
}

