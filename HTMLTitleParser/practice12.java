public class practice12 {
  // mantenScoreメソッド
  public static void mantenScore(int[] scores){
    // scoresの配列の1番最初に100が入る
    scores[0] = 100;
  }

  public static void main(String[] args){
    // メインの処理
    // 数字のデータ型の配列をscoresという変数で用意、中に数字を入れておく
    int[] scores = {74,32,45,98,89,13,57,43};
    // コマンドラインにscoresの配列で一番先頭のものを出力
    System.out.println(scores[0]);
    // mantenScoreメソッドを呼び出し
    mantenScore(scores);
    // コマンドラインにscoresの配列で一番先頭のものを出力
    System.out.println(scores[0]);
  }
}
