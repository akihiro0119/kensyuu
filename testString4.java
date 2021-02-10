class testString4{
  public static void main(String args[]){
    String str1 = new String(" Good Morning   ");

    System.out.println("元の文字列「" + str1 + "」");
    System.out.println("文字数は" + str1.length() + "です");

    String new_str1 = str1.trim();

    System.out.println("空白を取り除いた文字列「" + new_str1 + "」");
    System.out.println("文字数は" + new_str1.length() + "です");
  }
}
