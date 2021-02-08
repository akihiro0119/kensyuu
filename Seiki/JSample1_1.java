package Seiki;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

class JSample1_1{
  public static void main(String args[]){
    String str1 = "Hello";
    String str2 = "Hey";

    String regex = "e.*o";
    Pattern p = Pattern.compile(regex);

    Matcher m1 = p.matcher(str1);

    System.out.print(str1 + " は");
    if (m1.find()){
      System.out.println("マッチします");
    }else{
      System.out.println("マッチしません");
    }

    Matcher m2 = p.matcher(str2);

    System.out.print(str2 + " は");
    if (m2.find()){
      System.out.println("マッチします");
    }else{
      System.out.println("マッチしません");
    }
  }
}
