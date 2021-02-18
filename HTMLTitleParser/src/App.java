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
import java.util.ArrayList;
import java.util.Calendar;


public class App {
    public static void main(String[] args) throws Exception {

            //カレンダークラスにより現在日時を取得
            Calendar c = Calendar.getInstance();

            // 日時のフォーマットを設定
            DateFormat myFormat = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss"); 

            // ファイル名を定義
            String FileName = myFormat.format(c.getTime());
            File newFile = new File("/Users/mono/tmp/index" + FileName + ".csv");

            try{
                if(newFile.createNewFile()){
                    System.out.println("ファイルの作成に成功");
                }else{
                    System.out.println("ファイルの作成に失敗");
                }
            }catch(IOException e){
                System.out.println(e);
            }

            // フォルダを指定
            

            if (args.length != 0){ //引数必ず１つであること

                File dir = new File(args[0]);
      
                File[] fileList = dir.listFiles();
      
                  if(fileList != null){
                      for(int i = 0; i < fileList.length; i++){
                        if(fileList[i].getName().contains(".html")){
                            
                            if(checkBeforewritefile(newFile)){
                                FileWriter fileWriter =  new FileWriter(newFile);

                                fileWriter.write(fileList[i].getName());
                                System.out.println(fileList[i].getName() + "を書き込みました");
                            }else{
                                System.out.println("書き込めませんでした");
                            }
                
                        }
                      }
                  }
              
            }

            
            // フォルダのフルパスをCSVファイルに書き写す 先頭に書けるのであれば後から入力しても良い



    }      // 小テスト　フォルダ内の一つのファイルを指定





	private static boolean checkBeforewritefile(File fileName) {
        if(fileName.exists()){
            if(fileName.isFile() && fileName.canWrite()){
                return true;
            }
        }
        return false;
    }
    
}
