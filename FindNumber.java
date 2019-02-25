public class FindNumber {

  public static void main(String[] args) {
    System.out.println(findNum(NUM_K));
  }

  private static int NUM_K = 7; // Задаем число K.

  private static int findNum (int k) {
    int check = 0;
    int b;

    for (int n = 1; n < k; n++) {
      b = n * (n - 1) / 2 + 1;
      if (k == b) {
        check = 1;
      }
    }
    if (check == 1) {
      return 1;
    }
    return 0;
  }
}
