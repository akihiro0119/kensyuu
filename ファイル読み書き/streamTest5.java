package ファイル読み書き;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class streamTest5{
  public static void main(String args[]){
    try{
      File file = new File("/Users/mono/tmp/test.txt");

      if (checkBeforeWritefile(file)){
        FileWriter filewriter = new FileWriter(file, true);

        filewriter.write("はい。元気です¥r¥n");
        filewriter.write("ではまた¥r¥n");

        filewriter.close();
      }else{
        System.out.println("ファイルに書き込めません");
      }
    }catch(IOException e){
      System.out.println(e);
    }
  }

  private static boolean checkBeforeWritefile(File file){
    if (file.exists()){
      if (file.isFile() && file.canWrite()){
        return true;
      }
    }

    return false;
  }
}
