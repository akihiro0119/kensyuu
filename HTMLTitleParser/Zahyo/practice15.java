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

  public class kdata{
    String k1;
    String k2;
  }
  public kdata data;
  public void setKclass(){
  data = new kdata();
  data.k1 = this.k1;
  data.k2 = this.k2;
  }
}

