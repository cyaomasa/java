/* かけ算の九九表 */
public class lesson1 {
  public static void lesson1(String[] args) {
    for(int i = 1; i < 10; i++){
      for(int j = 1; j < 10; j++){
        System.out.printf(" %2d", i * j);
      }
      System.out.println();
    }
  }
}
