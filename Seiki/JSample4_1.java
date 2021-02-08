package Seiki;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

class JSample4_1{
  public static void main(String args[]){
    String str1 = "a";
    String str2 = ".";

    String regex1 = ".";
    Pattern p1 = Pattern.compile(regex1);

    String regex2 = "¥¥.";
    Pattern p2 = Pattern.compile(regex2);

    check(p1, str1);
    check(p1, str2);
    check(p2, str1);
    check(p2, str2);
  }

  private static void check(Pattern p, String target){
    Matcher m = p.matcher(target);

    System.out.print(target + " は " + p.pattern() + " に");

    if (m.find()){
      System.out.println("マッチします");
    }else{
      System.out.println("マッチしません");
    }
  }
}
