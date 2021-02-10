class ctest13{
  public static void main(String args[]){
    B sample = new B();

    System.out.println("サブクラスからのアクセス");
    sample.getVar();

    System.out.println("他クラスからのアクセス");
    System.out.println("値：" + sample.get());
  }
}

class A{
  protected int var = 0;

  protected int get(){
    return var;
  }
}

class B extends A{
  public void getVar(){
    System.out.println("値：" + var);
    System.out.println("値：" + get());
  }
}
