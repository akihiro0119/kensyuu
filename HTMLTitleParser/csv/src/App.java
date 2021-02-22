import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class App {

    public static void main(String[] args) throws Exception {
        
        //カレンダークラスにより現在日時を取得
        Calendar c = Calendar.getInstance();

        // 日時のフォーマットを設定
        DateFormat myFormat = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss"); 

        String FileName = "index" + myFormat.format(c.getTime());
        
        File newFile = new File("/Users/mono/tmp/" + FileName + ".csv");

        try{

            if(newFile.createNewFile()){
                
                System.out.println(FileName + "のファイルの作成に成功");
            
            }else{
                
                System.out.println("ファイルの作成に失敗");
            
            }

        }catch(IOException e){
            
            System.out.println(e);
        
        }

        if (args.length != 0){

            File dir = new File(args[0]);
            
            File[] fileList = dir.listFiles();
            
            for(int i = 0; i < fileList.length; i++){
                
                if(fileList[i].getName().contains(".html")){
                    
                    if(checkBeforewritefile(newFile)){
                        
                        BufferedWriter bw = new BufferedWriter(new FileWriter(newFile));
                        
                        System.out.println(fileList[i].getName() + "のファイル名を書き込みました");
                        
                        bw.write(fileList[i].getName());

                        bw.close();
                    }
                    
                    else{
                        System.out.println("書き込めませんでした");
                    }
                    
                }
            }
        }
    }

        private static boolean checkBeforewritefile(File newFile) {
            if(newFile.exists()){
                if(newFile.isFile() && newFile.canWrite()){
                    return true;
                }
            }
            return false;
        }
}

