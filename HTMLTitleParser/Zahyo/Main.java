package Zahyo;

public class Main {
  public static void main(String[] args){ //メインの処理はここから
    practice15 p15 = new practice15(); // クラスpractice15をp15に置き換え
    Point p = new Point(); // クラスPointをpと置き換え
    p15.setKclass(); // p15のKclassをセット
    p.goukaku(p15.data); //pの合格メソッドにp15のdataを引き渡し
  }
}
