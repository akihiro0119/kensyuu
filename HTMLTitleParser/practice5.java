//メソッドを共有したサンプル
public class practice5 {
  static int a = 10;
  static int b = 20;

  public static void main(String[] args){
  // メインの処理
    // printOneValueメソッドの処理
    // 最大値の表示が目的
    printOneValue();
    // printThreeValuesメソッドの処理
    // 最大値、最小値、平均値の表示が目的
    printThreeValues();
  }

  //メインの一番最初に呼び出されるメソッド
  private static void printOneValue(){
    //printMaximumメソッドの処理
    printMaximum();
  }

  //メインの2番目に呼び出されるメソッド
  private static void printThreeValues(){
    //printMaximumメソッドの処理
    printMaximum();
    //printMinimumメソッドの処理
    printMinimum();
    //printAverageメソッドの処理
    printAverage();
  }

  private static void printMaximum(){
    int maximum = a;
    if (b > a){
      maximum = b;
    }
    System.out.println("[24]最大値:" + maximum);
  }

  private static void printMinimum(){
    int minimum = a;
    if (b < a){
      minimum = b;
    }
    System.out.println("[29]最小値" + minimum);
  }

  private static void printAverage(){
    int average = (a + b) / 2;
    System.out.println("[32]平均値:" + average);
  } 
}
