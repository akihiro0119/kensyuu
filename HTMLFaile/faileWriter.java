package HTMLFaile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class faileWriter {
  static void writeTo(File file, BufferedWriter bw, String enter, Pattern p){
    BufferedReader br = null;
    

      //もし htmlを含むファイル名があるならば
      try{

          // 処理中のHTMLファイルの名前を格納
          String htmlName = file.getName();
          // もし、処理中のファイルの拡張子がhtmlだったら
          if(htmlName.contains(".html")){
              
          //if(checkBeforewritefile(newFile)){ 
              // 処置中のhtmlファイル名を書き込む
              bw.write(htmlName);
              //カンマを書き込み
              bw.write(",");
              // 書き込みが出来たことをコマンドラインで表示
              System.out.println(htmlName + "のファイル名を書き込みました");
              // ファイルを読み込む準備
              br = new BufferedReader(new FileReader(file));
              // String型を定義                                 
              String line;

              // trueをflgに代入                                    
              boolean flg = true;

              // 行がなくなるまで1行ずつ処理していく
              while((line = br.readLine()) != null){

                  // もしlineにパターンがヒットするなら
                  if (check(p,line)){
                      // titleとその閉じタグを消す
                      line = line.replace("<title>" , "");
                      line = line.replace("</title>", "");
                      //lineを書き込みと改行
                      bw.write(line + enter);
                      // falseをflgに代入
                      flg = false;
                      // nullになる前に処理を終了
                      break;
                  }
              }
              // もしflgを処理するなら falseなら breakしないなら
              if(flg){
                  // タイトル無しを記述し改行
                  bw.write("タイトル無し" + enter);
              }

          //}
      // htmlファイル以外の場合はファイル名と上記をコマンドラインに表示
      }else{
          System.out.println(htmlName + "はHTMLではありません");
      }

  }catch(IOException e){
      System.out.println(e);
  }finally{
      // 読み込みを終了
      if (br != null){
          try { 
              br.close(); 
          }
          catch(IOException ex){
          }
      }
  }

}

private static boolean check(Pattern p, String line) {
  // マッチを定義 パターンがlineから見つかるか
  Matcher m = p.matcher(line);
  return m.find();
  }
}
