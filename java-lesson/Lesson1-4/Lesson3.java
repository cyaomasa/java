public class Lesson3 {
  public static void main(String[] args) {
    int[] scores = {20, 30, 40, 50, 60};
    int sum = scores[0] + scores[1] + scores[2] + scores[3] + scores[4];
    int avg = sum / scores.length;
    System.out.println("合計点は" + sum);
    System.out.println("平均点は" + avg);
  }
}
