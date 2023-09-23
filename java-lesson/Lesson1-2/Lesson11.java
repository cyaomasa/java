public class Lesson11 {
  public static void main(String[] args){
    int rand = new java.util.Random().nextInt(1000);
    System.out.println("あなたの年齢と性別を教えてください。");
    int age = new java.util.Scanner(System.in).nextInt();
    String sex = new java.util.Scanner(System.in).nextLine();
    System.out.println("あなたの今日のラッキーナンバーは" + rand + "です。");
  }
}
