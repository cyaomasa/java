public class Practice7 {
  public static void main(String[] args) {
    // 指定した文字より後ろの文字取り出し
    String str = "氏名：山田太郎";
    int index = str.indexOf("：");
    System.out.println("取り出し文字列->" + str.substring(index+1));
    // 指定した文字より後ろの文字取り出し
    str = "氏名->山田太郎";
    index = str.indexOf("->");
    index += "->".length();
    System.out.println("取り出し文字列->" + str.substring(index));
  }
}
