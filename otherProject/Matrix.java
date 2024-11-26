import java.util.Scanner;

public class Matrix {
  public static void main(String[] args) {
    int[][] matA;
    int[][] matB;
    int[][] demoMatA = {
        { 1, 2, 3, 4, 5 },
        { 9, 8, 7, 6, 5 },
        { -7, 11, 24, 4, 1 }
    };
    int[][] demoMatB = {
        { 7, 4, 1, 2, 9 },
        { 8, 5, 0, 4, 3 },
        { 12, 7, 11, -6, 0 }
    };
    int m = 3;
    int n = 5;
    Scanner keyboard = new Scanner(System.in);
    do {
      System.out.print("1. Custom array\n2. Demo array\nSelect: ");
      int option = keyboard.nextInt();
      switch (option) {
        case 1:
          System.out.print("Number of rows: ");
          m = keyboard.nextInt();
          System.out.print("Number of columns: ");
          n = keyboard.nextInt();
          matA = new int[m][n];
          matB = new int[m][n];
          System.out.print("Enter elements of matrix A: ");
          for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
              matA[i][j] = keyboard.nextInt();
          System.out.print("Enter elements of matrix B: ");
          for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
              matA[i][j] += keyboard.nextInt();
          break;
        case 2:
          matA = demoMatA;
          matB = demoMatB;
          for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
              matA[i][j] += matB[i][j];
          break;
        default:
          System.out.println("Invalid. Try again.");
          continue;
      }
      break;
    } while (true);
    System.out.println("The sum of two matrices:");
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++)
        System.out.printf("%3d ", matA[i][j]);
      System.out.println();
    }
    keyboard.close();
    System.exit(0);
  }
}