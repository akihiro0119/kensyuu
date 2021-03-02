class Point{
  int x;
  int y;
}

public class practice10 {
  
  public static void printZahyo(Point zahyo){
    System.out.print("座標は(");
    System.out.print(zahyo.x);
    System.out.print(",");
    System.out.print(zahyo.y);
    System.out.print(")です");
  }

  public static void main(String[] args){
     //インスタンス生成
     Point zahyo = new Point();
     zahyo.x =4;
     zahyo.y =6;
     printZahyo(zahyo);
  }
}
