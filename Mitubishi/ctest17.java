package Mitubishi;

class ctest17{
  public static void main(String args[]){
    C c = new C();
    c.disp();
  }
}

class A{
  public void disp(){
    System.out.println("電化製品です");
  }
}

class B extends A{
  public void disp(){
    System.out.println("エアコンです");
    super.disp();
  }
}

class C extends B{
  public void disp(){
    System.out.println("三菱製です");
    super.disp();
  }
}
