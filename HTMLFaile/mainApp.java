package HTMLFaile;

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

public class mainApp {
  
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
        }else{
            //上手くいかなかったらコマンドラインに失敗と表示
            System.out.println("ファイルの作成に失敗");
            return;
        }
    }catch(IOException e){
        System.out.println(e);
        return;
    }

    // csvファイルにファイル書き込みをする宣言
        // ここでbwが始まっている
    BufferedWriter bw = new BufferedWriter(new FileWriter(newFile));
    // 環境に依存しない改行コードの定義
    String enter = System.getProperty("line.separator");

    // これを取得したいと定義
    String regex = "<title>(.*)</title>";
    // 定義した物をパターンと定義
    Pattern p = Pattern.compile(regex);

    //引数必ず１つであること
    if (args.length != 0){ 
      //設定からフォルダを引数として受け取る
      File dir = new File(args[0]);
      //フォルダの中身を配列として格納
      File[] fileList = dir.listFiles(); 

          //もしフォルダの中身が終わってないなら
      if(fileList != null){

              // 繰り返し
          for(int i = 0; i < fileList.length; i++){ 

              faileWriter.writeTo(fileList[i],bw,enter,p);   
          }
      }
    }
  bw.close();
  }
}


// 判断 
// 抽出
// 書き込み

// forの中の全てを

// 変数を使うところ=ブロックの中に宣言
// 親ブロックを確認
// メソッドの引数として渡せているか 

// 既にインスタンスになっている
// 繰り返し呼び出されるから処理が重くなる

// staticがついているメソッド単体での呼び出しが可能
// staticがついていないメソッドは変数.メソッド();の形で使う

// 上位クラスにある物は引数として使うことができる
// 上位クラスや自クラスに宣言されていない物は使えない
// 自ブロックで使いたい変数に変更して使うことも可能、mainなどの呼び出し元では呼び出し元で使いたい変数を使って書くこと
// 入力、処理、出力にクラスなどを分ける（？）
// 
