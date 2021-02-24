import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class App2 {
  public static void main(String[] args) {
    App2 obj = new App2();
    try {
        obj.run(args[0]);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
  }

  private void run(String fileName) {
    try {
      String result = getHtmlTitle(fileName);
      System.out.println("result: " + result);
    }catch (Exception ex) {
      ex.printStackTrace();
    }
  }

  public String getHtmlTitle(String fileName)
  throws IOException
  {
    String result = "";

    BufferedReader br = null;
    try {
      String regex ="<(title|title)>.*?</>";
      Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

      String content = "";
      String line;

      br = new BufferedReader(new FileReader(fileName));
      while((line = br.readLine()) != null) {

        content += line;
        Matcher matcher = pattern.matcher(content);

        if (matcher.find()) {
          System.out.println("match: " + matcher.group(0));
          result = matcher.group(1);

          break;
        }
      }
    }finally {
      if (br != null) {
          br.close();
      }
  }return result;
  }
}
