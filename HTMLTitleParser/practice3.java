// メソッドを分けたサンプル
// 数字のデータ型の箱に数字を格納
public class practice3 {
  static int a = 10;
  static int b = 20;

  public static void main(String[] args){
  // メインの処理
    //printMaximumメソッドを実行
    // 最大値の表示が目的
    printMaximum();
    //printMinimumメソッドを実行
    //最小値の表示が目的
    printMinimum();
    //printAverageメソッドを実行
    //平均値の表示が目的
    printAverage();
  }
  //printMaximumメソッドの内容はここから
  private static void printMaximum(){
    // maximumというデータ型にa（定義済みの数字）を代入
    int maximum = a;
    // if文の処理
    if(b > a){
      maximum = b;
    }
    System.out.println("[24]最大値:" + maximum);
  }

  private static void printMinimum(){
    int minimum = a;
    if (b > a){
      minimum = b;
    }
    System.out.println("[29]最小値:" + minimum);
  }
  private static void printAverage(){
    int average = (a + b) / 2;
    System.out.println("[32]平均値:" + average);
  }
}
