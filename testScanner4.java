import java.util.Scanner;

class testScanner4{
  public static void main(String args[]){
    System.out.println("文字をカンマ区切りで入力して下さい。");

    Scanner scan = new Scanner(System.in);
    scan.useDelimiter("¥¥s*,¥¥s*|¥n");

    String str = scan.next();
    System.out.println("最初のトークンは: "+ str); 

    str = scan.next();

    scan.close();
    System.out.println("次のトークンは  : "+ str);
  }
}
