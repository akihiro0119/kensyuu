public class practice8 {
  // int型の引数をメソッドに渡す
  public static void printNum(int num){
    System.out.println("引数「" + num + "」を受け取りました");
  }

  // String型の引数をメソッドに渡す
  public static void printText(String text){
    System.out.print("引数「" + text + "」を受け取りました");
  }

  //メインメソッド（ここから実行）
  public static void main(String[] args){
    printNum(3);
    printText("ABC");
  }
}
