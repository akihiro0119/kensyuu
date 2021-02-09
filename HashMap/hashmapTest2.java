package HashMap;

import java.util.HashMap;

class hashmapTest2{
  public static void main(String args[]){
    HashMap<String,String> map = new HashMap<String,String>();

    map.put("りんご", "apple");
    map.put("ぶどう", "grapes");

    if (map.containsKey("りんご")){
      System.out.print("りんごを英語にすると");
      System.out.println(map.get("りんご"));
    }else{
      System.out.println("指定したキーは存在しません");
    }

    map.remove("ぶどう");

    if (map.containsKey("ぶどう")){
      System.out.print("ぶどう英語にすると");
      System.out.println(map.get("ぶどう"));
    }else{
      System.out.println("指定したキーは存在しません");
    }
  }
}
