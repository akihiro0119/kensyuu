package Zahyo;

public class practice15 {
  private String k1 = "よし";
  private String k2 = "合格";
     //public String getK1() {
      //return k1;
     //}
     //public String getK2() {
       //return k2;
     //}

    // public String[] getK(){
      // String[] K = new String[2];
      // K[0] = k1;
      // K[1] = k2;
      //return K;
    //}

  public kdata data; //kdataクラスをdataに再定義

  public void setKclass(){ // Kclassを再定義 voidのため現状は空っぽ
    data = new kdata(); // dataに20行目のkdataを代入
    data.k1 = this.k1; // data.k1に4行目のk1を代入
    data.k2 = this.k2; // data.k2に5行目のk2を代入
  }

  public class kdata{ //構造体の生成 publicだから全てのクラスから
    String k1; // String形のk1を作成。4行目のk1を引き取る場所？
    String k2; // String形のk2を作成。5行目のk2を引き取る場所？
  }
}

