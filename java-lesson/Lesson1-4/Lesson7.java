public class Lesson7 {
  public static void main(String[] args) {
    int[] seq = new int[10];
    for (int i = 0; i < seq.length; i++) {
      seq[i] = new java.util.Random().nextInt(4);
    }
    for (int i = 0; i < seq.length; i++) {
      char[] base = {'A', 'B', 'C', 'D'};
      System.out.println(base[seq[i]]);
    }
  }
}
