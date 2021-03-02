// メソッドを分けたサンプル
public class practice3 {
  static int a = 10;
  static int b = 20;

  public static void main(String[] args){
    printMaximum();
    printMinimum();
    printAverage();
  }
  private static void printMaximum(){
    int maximum = a;
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
