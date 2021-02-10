class testString7{
  public static void main(String args[]){
    String str = "今日の天気は晴れでした。明日の天気は晴れです。";
    System.out.println("変換前:");
    System.out.println(str);

    str = str.replaceAll("晴れ", "雨");
    System.out.println("変換後:");
    System.out.println(str);
  }
}
