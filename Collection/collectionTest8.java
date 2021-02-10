package Collection;

import java.util.LinkedList;

class collectionTest8{
  public static void main(String args[]){
    LinkedList<String> array = new LinkedList<String>();

    array.add("日本");
    array.add("ブラジル");
    array.add("日本");
    array.add("イングランド");

    for (int i = 0 ; i < array.size() ; i++){
      String country = array.get(i);
      System.out.println(country);
    }

    String word = "日本";
    int first = array.indexOf(word);

    System.out.println(word + "について検索します");

    if (first != -1){
      System.out.println("最初のインデックス番号は " + first);
    }

    int last = array.lastIndexOf(word);
    if (last != -1){
      System.out.println("最後のインデックス番号は " + last);
    }
  }
}
