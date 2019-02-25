public class FindNumber {

  public static void main(String[] args) {
    System.out.println(findNum(NUM_K));
  }

  private static int NUM_K = 121; // Задаем число K.

  private static int findNum (int k) {
    boolean check = false;
    int b = 0;
    int n = 1;

    while (b < k) {
      b = n * (n - 1) / 2 + 1;
      System.out.println("b = " + b + " and n = " + n);
      n += 1;
      if (b == k) {
        check = true;
      }
    }
    return check ? 1 : 0;
  }
}
