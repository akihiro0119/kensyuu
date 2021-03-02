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
    int[] scores = {72,68,87,78,62,5500,48,6390,70,95};
    int average = getAverage(scores);
    System.out.println("平均値は「" + average + "」です" );
  }
}
