import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class WriteFile {
  public static void main(String args[]){
    try {
      File file = new File("c:¥¥tmp¥¥test.txt");

      FileWriter filewriter = new FileWriter(file);
      // ファイルに書き込む　という命令を定義

      filewriter.write("こんにちは¥r¥n");
      filewriter.write("お元気ですか¥r¥n");

      filewriter.close();
    } catch(IOException e)
    // 入出力が不正だった場合
     {
      System.out.println(e);
    }
  }
}
