class ctest19{
  public static void main(String args[]){
    superClass obj[] = new superClass[3];

    obj[0] = new subClassA();
    obj[1] = new subClassB();
    obj[2] = new subClassC();

    for (int i = 0 ; i < 3 ; i++){
      obj[i].dispName();
    }
  }
}

class superClass{
  public void dispName(){
    System.out.println("未定義です");
  }
}

class subClassA extends superClass{
  public void dispName(){
    System.out.println("製品名はXXXです");
  }
}

class subClassB extends superClass{
  public void dispName(){
    System.out.println("製品名はYYYです");
  }
}

class subClassC extends superClass{
  public void dispName(){
    System.out.println("製品名はZZZです");
  }
}
