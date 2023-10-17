public class Test9 {
  public static void main(String[] args) {
    int[] number = new int[20];
    for (int i = 1; i < number.length; i++) {
      number[i] = number[i - 1] + 5;
    }
    for (int i = 1; i <= 10; i++) {
      System.out.println(number[i]);
      if (i % 2 != 0) {
        System.out.print(",");
      }
    }
    for (int i = 11; i <= 19; i++) {
      System.out.println(number[i]);
      if (i % 2 == 0) {
        System.out.print(",");
      }
    }
  }
}
