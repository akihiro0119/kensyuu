import java.io.File;

class DeleteFile {
  public static void main(String args[]){
    File file = new File("c:¥¥tmp¥¥newfile.txt");
    // 操作するファイルを定義

    if (file.delete())
    // デリートメソッドが実行された場合の処理
    {
      System.out.println("ファイルを削除しました");
    } else {
      System.out.println("ファイルの削除に失敗しました");
    }
  }
}
