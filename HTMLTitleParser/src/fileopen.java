import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class fileopen {
  public static void main(String args[]){
  File folder = new File("/Users/mono/tmp");

            // 小テスト　フォルダ内の一つのファイルを指定
            try{

            File file = new File("/Users/mono/tmp/html.html");

             // 2.ファイルが存在しない場合に例外が発生するので確認する
                if (!file.exists()) {
                    System.out.print("ファイルが存在しません");
                    return;
                }

            //　小テスト　ファイルを１行ずつ読む
            FileReader filereader = new FileReader(file);

            BufferedReader in = new BufferedReader(filereader);

            String line;
            while((line = in.readLine()) != null) System.out.println(line);
          } catch (FileNotFoundException e){
            e.printStackTrace();
            System.exit(-1); // 0 以外は異常終了
          } catch (IOException e){
            e.printStackTrace();
            System.exit(-1);
        }
  }
}
