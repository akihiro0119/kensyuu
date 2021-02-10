import java.io.File;

class fileTest1{
  public static void main(String args[]){
    File cdirectory = new File("c:¥¥");

    String filelist[] = cdirectory.list();
    for (int i = 0 ; i < filelist.length ; i++){
      System.out.println(filelist[i]);
    }
  }
}
