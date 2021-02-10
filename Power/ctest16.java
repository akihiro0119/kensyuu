package Power;

class ctest16{
  public static void main(String args[]){
    B1 b1 = new B1();
    b1.disp();

    B2 b2 = new B2();
    b2.disp();
  }
}

class A{
  public void disp(){
    System.out.println("電化製品です");
  }
}

class B1 extends A{
  public void disp(){
    System.out.println("エアコンです");
  }
}

class B2 extends A{
}
