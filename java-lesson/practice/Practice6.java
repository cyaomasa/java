public class Practice6 {
  static public void main(String args[]){
    String str = "壱２34伍６７89０";
    System.out.println(String.format("取り出し前の文字列 ： %s", str));
    System.out.println("文字列の6文字目から最後までを取り出す -> "
                                           + str.substring(6-1));
    System.out.println("文字列の後ろ3文字分を取り出す -> "
                                           + str.substring(str.length()-3));
  }
}
