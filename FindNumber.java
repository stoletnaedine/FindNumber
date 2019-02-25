public class FindNumber {

  public static void main(String[] args) {
    System.out.println(findNum(NUM_K));
  }

  private static int NUM_K = 7; // Задаем число K.

  private static int findNum (int k) {
    boolean check = false;
    int b;

    for (int n = 1; n < k; n++) {
      b = n * (n - 1) / 2 + 1;
      if (k == b) {
        check = true;
      }
    }
    if (check) {
      return 1;
    }
    return 0;
  }
}
