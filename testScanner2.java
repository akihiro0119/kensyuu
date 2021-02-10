import java.util.Scanner;

class testScanner2{
  public static void main(String args[]){
    System.out.println("数値を入力して下さい。");

    Scanner scan = new Scanner(System.in);

    int val = scan.nextInt();
    System.out.println("最初の数値のトークンは: "+ val); 

    val = scan.nextInt();
    System.out.println("次の数値のトークンは  : "+ val);

    scan.close();
  }
}
