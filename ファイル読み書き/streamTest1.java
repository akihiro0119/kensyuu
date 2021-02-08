package ファイル読み書き;

import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

class streamTest1{
  public static void main(String args[]){
    try{
      File file = new File("/Users/mono/tmp/test.txt");
      FileReader filereader = new FileReader(file);

      int ch;
      while((ch = filereader.read()) != -1){
        System.out.print((char)ch);
      }

      filereader.close();
    }catch(FileNotFoundException e){
      System.out.println(e);
    }catch(IOException e){
      System.out.println(e);
    }
  }
}
