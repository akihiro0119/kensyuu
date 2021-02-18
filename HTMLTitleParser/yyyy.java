import java.io.File;
import java.util.Scanner;

public class yyyy {
      public static void main(String[] args) throws Exception {
      
        if (args.length != 0){ //引数必ず１つであること

          File dir = new File(args[0]);

          File[] fileList = dir.listFiles();

            if(fileList != null){
                for(int i = 0; i < fileList.length; i++){
                  if(fileList[i].getName().contains(".html")){
                    System.out.println(fileList[i].getName());
                  }
                }
            }
        }
      }
}

