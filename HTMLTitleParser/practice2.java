
public class practice2 {
  static int a = 10;
  static int b = 20;

  public static void main (String[] args){
    printThreeValues();
  }

  private static void printThreeValues(){
    int maximum = a;
    if(b > a){
      maximum = b;
    }
    int minimum = a;
    if(b > a){
      minimum = b;
    }
    int average = (a + b) / 2;

    System.out.println("[28]最大値:" + maximum);
    System.out.println("[29]最小値:" + minimum);
    System.out.println("[30]平均値:" + average);
  }
}
