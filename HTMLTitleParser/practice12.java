public class practice12 {
  public static void mantenScore(int[] scores){
    scores[0] = 100;
  }

  public static void main(String[] args){
    int[] scores = {74,32,45,98,89,13,57,43};
    System.out.println(scores[0]);

    mantenScore(scores);
    System.out.println(scores[0]);
  }
}
