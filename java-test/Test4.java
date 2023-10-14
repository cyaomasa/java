public class Test4 {
  public static void main(String[] args) {
    int counts = 0;
    for (int i = 1; i <= 10; i++) {
      if (i % 2 == 0) {
        counts++;
      }
    }
    System.out.println("1~10までの偶数の数は" + counts);
  }
}
