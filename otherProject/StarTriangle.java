import java.util.Scanner;

public class StarTriangle {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("n = ?");
    int n = keyboard.nextInt();
    int width = 2 * n - 1;
    for (int i = 1; i <= n; i++) {
      int j = 1;
      int line = 2 * i - 1;
      for (; j <= (width - line) / 2; j++) {
        System.out.print(" ");
      }
      while (line > 0) {
        System.out.print("*");
        j++;
        line--;
      }
      for (; j < width; j++) {
        System.out.print(" ");
      }
      System.out.println("");
    }
    keyboard.close();
    System.exit(0);
  }
}
