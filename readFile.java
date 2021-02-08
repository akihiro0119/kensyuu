import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class readFile {
  public static void main(String args[]) {
    try {
      File file = new File("c:¥¥tmp¥¥test.txt");
      // ファイル名を指定

      FileReader filereader = new FileReader(file);
      // ファイルを読む　という指示を定義
      int ch;
      while((ch = filereader.read()) != -1){
        System.out.print((char)ch);
      }
      filereader.close();
    } catch(FileNotFoundException e) //ファイルが開けない際の処理
    {
      System.out.println(e);
    } catch(IOException e) //不正な入出力の場合の処理
     {
      System.out.println(e);
    }
  }
}
