import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class xxxx {
    public static void main(String[] args){
        File file = new File("/Users/mono/tmp/html.html");
        
        try (BufferedReader in = new BufferedReader //まとめて
        (new FileReader(file))){ // ファイルを読み込む準備 


            String line;
            while((line = in.readLine()) != null);

            String regex =" <(title)>.*?<\\>";
            // String型、正規表現でタイトルの前後を取りたいよ
            Pattern p = Pattern.compile(regex);
            // 改行を含まないテキストを読み込むよ
            // プリントアウトする
            // null(なくなる)まで続けるよ

            check(p,line);

        } catch (FileNotFoundException e){ 
            e.printStackTrace();
            System.exit(-1); // 0 以外は異常終了
        } catch (IOException e){ 
            e.printStackTrace();
            System.exit(-1);
        }
    }

    private static void check(Pattern p, String line) {
        Matcher m = p.matcher(line);

        if (m.find()){
            //　バッファ　取得したタイトル　で書き込み
        }else{
            // バッファ　タイトルなし　で書き込み
        }
    }
}
