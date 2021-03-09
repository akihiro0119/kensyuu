public class practice11 {
  public static int oneupNum(int num){
    // numに１をたす処理
    num++;
    // numを返す
    return num;
  }

  public static void main(String[] args){
    // メインの処理
    // 数字のデータ型 numという変数に3を代入
    int num = 3;
    // コマンドラインにoneupNumでのnumを出力 4を期待
    System.out.println(oneupNum(num));
    // コマンドラインにnumを出力 3を期待
    System.out.println(num);
  }
}
