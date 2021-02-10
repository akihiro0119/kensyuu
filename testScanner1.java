import java.util.Scanner;

class testScanner1{
  public static void main(String args[]){
    System.out.println("文字を入力して下さい。");

    Scanner scan = new Scanner(System.in);

    String str = scan.next();
    System.out.println("最初のトークンは: "+ str);

    System.out.println("次の文字を入力して下さい。");

    str = scan.next();

    scan.close();
    System.out.println("次のトークンは  : "+ str);
  }
}
