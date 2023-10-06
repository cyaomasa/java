public class Lesson4 {
  public static void main(String[] args) {
    System.out.println("メソッドを呼び出します");
    hello("奏");
    hello("浅香");
    hello("すがわら");
    System.out.println("メソッドの呼び出しが終わりました。");
  }
  public static void hello(String name) {
    System.out.println(name + "さん、こんにちは");
  }
}
