import java.io.*;

public class xxxx {
    public static void main(String[] args){
        String filename = "sample.txt";
        
        try (BufferedReader in = new BufferedReader(new FileReader(new File(filename)))){
            String line;
            while((line = in.readLine()) != null) System.out.println(line);
        } catch (FileNotFoundException e){ 
            e.printStackTrace();
            System.exit(-1); // 0 以外は異常終了
        } catch (IOException e){ 
            e.printStackTrace();
            System.exit(-1);
        }
    }   
}
