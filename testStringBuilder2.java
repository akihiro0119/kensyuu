class testStringBuilder2{
  public static void main(String args[]){
    StringBuilder sb = new StringBuilder();
    sb.append("こんにちは。元気です。");
    sb.insert(5, "鈴木さん");

    System.out.println(new String(sb));
  }
}
