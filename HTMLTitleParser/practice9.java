public class practice9 {
  public static int getAverage(int[] scores){
    int sum = 0;
    for(int i = 0; i < scores.length; i++){
      sum = sum + scores[i];
    }
    int average = sum / scores.length;
    return average;
  }

  //ここから実行
  public static void main(String[] args){
  // メイン処理
    // 数字のデータ型coresという変数を配列で用意
    // 配列のなかに数字を格納
    int[] scores = {72,68,87,78,62,5500,48,6390,70,95};
    // 数字のデータ型averageを用意する
    // getAverageメソッドにscoresを渡して得られたデータをaverageに戻し格納
    int average = getAverage(scores);
    // コマンドラインに平均値の表示
    System.out.println("平均値は「" + average + "」です" );
  }
}
