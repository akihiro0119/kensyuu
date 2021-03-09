public class practice1 {
  // 数字のデータ型a,bを用意、それぞれに数字を代入
  static int a = 10;
  static int b = 20;

  public static void main(String[] args){
    // メインの処理 
    // printOneValueメソッド処理
    // 最大値の表示が目的
    printOneValue();
    // printThreeValuesメソッドを処理
    // 最大値、最小値、平均値の表示が目的
    printThreeValues();
  }

  // printOneValueメソッドの処理
  private static void printOneValue(){
    // printMaximumメソッドを呼び出し
    printMaximum();
  }
  private static void printThreeValues(){
    printMaximum();
    printMinimum();
    printAverage();
  }

  // printMaximumメソッドの処理
  private static void printMaximum(){
    // 数字のデータ型 最大値の箱を用意しaを代入
    int maximum = a;
    if (b > a) {
      maximum = b;
    }
    System.out.println("[24]最大値;" + maximum);
  }

  private static void printMinimum(){
    int minimum = a;
    if(b < a){
      minimum = b;
    }
    System.out.println("[29]最小値;" + minimum);
  }

  private static void printAverage(){
    int avarage = (a + b) / 2;
    System.out.println("[32]平均値;" + avarage);
  }
}
