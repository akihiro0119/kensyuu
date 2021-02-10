package Hero;

public class SuperHero extends Hero {

  public void attack(Matango m){
   super.attack(m);
   if(this.flying){
     super.attack(m);
   }
  }
private boolean flying;
  public void fly() {
    System.out.println("飛び上がった");
  }

  public void land() {
    System.out.println("着地した");
  }

  public void run() {
    // run()メソッドのオーバーライド
    System.out.println("撤退した");
  }
}
