public class practice7 {
  public static void main(String args[]) {
  // メインの処理
    // 文章のデータ型kekkaという変数を定義し、結果を代入
    String kekka = "結果";
    // 数字のデータ型numという変数を定義し、1を代入
    int num = 1;
    //methodメソッドにkekkaとnumを渡し処理
    // 結果１を表示
    method(kekka, num);
  }

  static void method(String str, int i) {
    System.out.println(str+i);
  }
}
