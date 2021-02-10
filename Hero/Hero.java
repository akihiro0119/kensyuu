package Hero;

import Story.Matango;

public class Hero {

  private String name = "アイルー";
  private int hp = 100;

  // 戦う
  public void attack(Matango m){
    System.out.println(this.name + "の攻撃");
    m.hp -= 5;
    System.out.println("５ポイントのダメージを与えた");
  }
  
  //　逃げる
  public void run(){
    System.out.println(this.name + "は逃げ出した");
  }

  //　転ぶ　継承禁止
  public final void slip(){
    this.hp -= 5;
    System.out.println(this.name + "は転んだ");
    System.out.println("5のダメージ");
  }
}
