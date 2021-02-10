package Collection;

import java.util.LinkedList;

class collectionTest6{
  public static void main(String args[]){
    LinkedList<String> array = new LinkedList<String>();

    array.add("日本");
    array.add("ブラジル");
    array.add("イングランド");

    array.add(1, "ポルトガル");

    for (int i = 0 ; i < array.size() ; i++){
      String country = array.get(i);
      System.out.println(country);
    }
  }
}
