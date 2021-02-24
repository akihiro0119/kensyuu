import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class App1 {

  public static void main(String[] args) throws Exception {

    //カレンダークラスにより現在日時を取得
    Calendar c = Calendar.getInstance();

    // 日時のフォーマットを設定
    DateFormat myFormat = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");

    String FileName = "index" + myFormat.format(c.getTime());

    Path path = Path.of("/Users/mono/tmp/", FileName, ".csv");
    var app = new App();
    if (!app.validate(args)) {
      return;
    }

    List<File> htmlFileList = app.getHtmlFiles(args[0]);
    if (htmlFileList.isEmpty()) {
      return;
    }

    List<String> csvRecords = new ArrayList<>();
    for (File file : htmlFileList) {
      String title = app.getTitle(file);
      var record = new CsvRecord(file.getName(), title);
      csvRecords.add(record.toCsv());
    }

    try {
      Files.write(path, csvRecords, StandardCharsets.UTF_8);
    } catch (IOException e) {
      System.out.println("ファイルの作成に失敗");
    }
  }

  /**
   * 引数をチェックする.
   *
   * @param args 引数
   * @return チェック結果
   */
  private boolean validate(String[] args) {
    if (args.length < 1) {
      return false;
    }
    return true;
  }

  /**
   * htmlファイルを取得する.
   *
   * @param path Path
   * @return htmlファイルリスト
   */
  private List<File> getHtmlFiles(String path) {
    List<File> ret = new ArrayList<>();
    File dir = new File(path);
    File[] fileList = dir.listFiles();
    if (Objects.isNull(fileList)) {
      // 空ならemptyListを返す
      return Collections.emptyList();
    }

    for (int i = 0; i < fileList.length; i++) {
      fileList[i].getName().endsWith(".html");
      ret.add(fileList[i]);
    }
    return ret;
  }

  /**
   * タイトルを取得する.
   *
   * @param file ファイル
   * @return タイトル
   */
  private String getTitle(File file) {
    // TODO: htmlファイルからtitleを取得する
    return "";
  }

  static class CsvRecord {

    /**
     * コンストラクタ.
     *
     * @param fileName ファイル名
     * @param title    タイトル
     */
    public CsvRecord(String fileName, String title) {
      this.fileName = fileName;
      this.title = title;
    }

    /**
     * ファイル名.
     */
    private String fileName;

    /**
     * タイトル.
     */
    private String title;

    /**
     * CSV変換.
     *
     * @return csv
     */
    public String toCsv() {
      return String.join(",", this.fileName, this.title);
    }
  }
}
