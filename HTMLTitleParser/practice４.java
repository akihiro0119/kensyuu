// メソッドをコピーしたサンプル
public class practice４ {
  static int a = 10;
  static int b = 20;

  public static void main(String[] args){
  // メインの処理
    // printOneValueメソッドを処理
    // 最大値の表示が目的
    printOneValue();
    // printThreeValuesメソッドを処理
    // 最大値、最小値、平均値の表示が目的
    printThreeValues();
  }

  private static void printOneValue(){
    int maximum = a;
    if (b > a){
      maximum = b;
    }
    System.out.println("[10]最大値:" + maximum);
  }

  private static void printThreeValues(){
    int maximum = a;
    if(b > a){
      maximum = b;
    }
    int minimum = a;
    if(b < a){
      minimum = b;
    }
    int average = (a + b) / 2;
    System.out.println("[27]最大値:" + maximum);
    System.out.println("[28]最小値:" + minimum);
    System.out.println("[29]平均値:" + average);
  } 
}
