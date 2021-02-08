package Seiki;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

class JSample3_1{
  public static void main(String args[]){
    String str1 = "stat[01]end";
    String str2 = "array[int]";

    String regex = "¥¥[.*¥¥]";
    Pattern p = Pattern.compile(regex);

    check(p, str1);
    check(p, str2);
  }

  private static void check(Pattern p, String target){
    Matcher m = p.matcher(target);

    if (m.find()){
      System.out.println("マッチします");
      System.out.println("マッチした部分は " + m.group() + " です");
    }else{
      System.out.println("マッチしません");
    }
  }
}
