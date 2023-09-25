public class Practice8 {
  public static void main(String[] args) {
    // 検索文字より前の文字列取り出し
    String str = "氏名：山田太郎";
    int index = str.indexOf("：");
    System.out.println("取り出し文字列->" + str.substring(0,index));
    str = "氏名->山田太郎";
    index = str.indexOf("->");
    System.out.println("取り出し文字列->" + str.substring(0,index));
  }
}
