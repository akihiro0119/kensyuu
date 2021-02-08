package Seiki;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

class JSample6_1{
  public static void main(String args[]){
    String str = "Tomato is 100yen, Lemon is 80yen, Banana is 140yen.";

    String regex = "¥¥d.+?yen";
    Pattern p = Pattern.compile(regex);

    System.out.println("Target：" + str);
    System.out.println("Pattern：" + regex + "¥n");

    check(p, str);
  }

  private static void check(Pattern p, String target){
    Matcher m = p.matcher(target);

    while(m.find()){
      System.out.println("match:" + m.group());
    }
  }
}
