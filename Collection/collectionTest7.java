package Collection;

import java.util.LinkedList;

class collectionTest7{
  public static void main(String args[]){
    LinkedList<String> array = new LinkedList<String>();

    array.add("日本");
    array.add("ブラジル");
    array.add("イングランド");

    for (int i = 0 ; i < array.size() ; i++){
      String country = array.get(i);
      System.out.println(country);
    }

    System.out.println("¥r¥n2番目の国をイタリアへ置き換えます¥r¥n");

    array.set(1, "イタリア");

    for (int i = 0 ; i < array.size() ; i++){
      String country = array.get(i);
      System.out.println(country);
    }

    System.out.println("¥r¥n先頭の国を削除します¥r¥n");

    array.remove(0);

    for (int i = 0 ; i < array.size() ; i++){
      String country = array.get(i);
      System.out.println(country);
    }
  }
}
