class testString2{
  public static void main(String args[]){
    String str1 = new String("Hello World!");
    String new_str1 = str1.substring(2, 5);

    System.out.println(str1 + "のsubstring(2,5)は" + new_str1 + "です");

    String str2 = new String("こんにちは");
    String new_str2 = str2.substring(2, 4);

    System.out.println(str2 + "のsubstring(2,4)は" + new_str2 + "です");
  }
}
