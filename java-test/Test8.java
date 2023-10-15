public class Test8 {
  public static void main(String[] args) {
    int[] sum = {1,2,3,4,5,6,7,8,9,10};
    for (int i = 0; i < sum.length; i++) {
      System.out.print(sum[i]);
      if (sum[i] != 10) {
        System.out.print(",");
      }
    }
  }
}
