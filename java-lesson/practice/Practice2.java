
public class Practice2 {
  static public void main(String args[]){
    String str1 = "文字列１";
    String str2 = "文字列２";
    StringBuffer sb = new StringBuffer();
    sb.append(str1);
    sb.append(str2);
    String str = sb.toString();
    System.out.println("StringBufferによる文字列の連結-> " + str);
  }
}
