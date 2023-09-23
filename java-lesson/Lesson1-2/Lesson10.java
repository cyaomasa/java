public class Lesson10 {
  public static void main(String[] args){
    int rand = new java.util.Random().nextInt(100);
    System.out.println("あなたの名前を入力してください。");
    String name = new java.util.Scanner(System.in).nextLine();
    System.out.println("あなたの年齢を入力してください。");
    int age = new java.util.Scanner(System.in).nextInt();
    System.out.println("ようこそ" + rand + "番目の方！！");
    System.out.println("あなたは" + age + "歳の" + name + "さんです！");
  }
}
