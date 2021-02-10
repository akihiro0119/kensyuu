class testMath6{
  public static void main(String args[]){
    double a = 42d;
    double b = 100d;
    double c = 0.08d;

    System.out.println("「" + a + "」の自然対数は");
    System.out.println("「" + Math.log(a) + "」です。");

    System.out.println("「" + b + "」を根とする対数は");
    System.out.println("「" + Math.log10(b) + "」です。");

    System.out.println("「" + c + "+1」を真数とする自然対数は");
    System.out.println("「" + Math.log1p(c) + "」です。");
  }
}
