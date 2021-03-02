package app;

public class FileRead {

  public static void doread(){

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

                  BufferedReader br = null;

                  //もし htmlを含むファイル名があるならば
                  try{

                      // 処理中のHTMLファイルの名前を格納
                      String htmlName = fileList[i].getName();
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
                          br = new BufferedReader(new FileReader(fileList[i]));
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
      }
  }
  bw.close();
  }
}
