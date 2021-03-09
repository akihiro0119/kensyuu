
public class practice2 {
  // 数字a,bの箱を用意し、それぞれに数字を代入
  static int a = 10;
  static int b = 20;

  public static void main (String[] args){
  // メインの処理 プリントスリーバリューズメソッドを実行
    // 最大値、最小値、平均値の表示が目的
    printThreeValues();
  }

  // プリントスルーバリューズメソッドを定義
  private static void printThreeValues(){
    // 数字 最大値の箱を用意しaを代入
    int maximum = a;
    // もしbがaより大きい場合
    if(b > a){
      // aが入っている最大値の箱にbを代入(aは外される)
      maximum = b;
    }
    // 数字 最小値の箱を用意し、aを代入
    int minimum = a;
    // もしbがaより小さかったら
    if(b < a){
      // aが入っている最小値の箱にbを代入(aは外される)
      minimum = b;
    }
    // aとbの平均値を数字のデータ型で定義
    int average = (a + b) / 2;
    // if文で求めた最大値、最小値、平均値をそれぞれコマンドラインに出力
    System.out.println("[28]最大値:" + maximum);
    System.out.println("[29]最小値:" + minimum);
    System.out.println("[30]平均値:" + average);
  }
}
