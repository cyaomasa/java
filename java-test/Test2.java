public class Test2 {
  // 1〜10の数字の偶数のみを大きい順に上から縦に並ぶように表示させる
  public static void main(String[] args) {
    for (int i = 1; i <= 10; i++) {
      if (i%2 == 0) {
        System.out.println(i);
      }
    }
  }
}
