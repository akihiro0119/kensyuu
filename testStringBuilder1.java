class testStringBuilder1{
  public static void main(String args[]){
    dispHantei("山田", 89);
    dispHantei("鈴木", 45);
    dispHantei("伊藤", 67);
    dispHantei("加藤", 92);
  }

  private static void dispHantei(String name, int tokuten){
    StringBuilder sb = new StringBuilder();

    sb.append(name);
    sb.append("さんの成績は");
    sb.append(tokuten);
    sb.append("点です。結果は");
    if (tokuten > 75){
      sb.append("合格");
    }else{
      sb.append("不合格");
    }
    sb.append("です。");

    System.out.println(new String(sb));
  }
}
