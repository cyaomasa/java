public class Test1 {
  // 1〜10の数字の偶数のみを大きい順に上から縦に並ぶように表示させる
  public static void main(String[] args) {
    int i = 1;
    while (10 >= i) {
      if (0 == (i % 2))
      System.out.println(i);
      i++;
    }
  }
}
