import java.util.Scanner;
import java.util.InputMismatchException;

class testScanner3{
  public static void main(String args[]){
    System.out.println("数値を入力して下さい。");

    Scanner scan = new Scanner(System.in);

    try{
      int val = scan.nextInt();
      System.out.println("最初の数値のトークンは: "+ val); 

      val = scan.nextInt();
      System.out.println("次の数値のトークンは  : "+ val);
    }catch (InputMismatchException e){
      System.out.println("型が違います：" + e);

      scan.close();
    }
  }
}
