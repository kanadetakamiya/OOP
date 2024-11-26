import java.util.Scanner;
import java.util.Arrays;

public class Array {
  public static void main(String[] args) {
    int[] arr;
    int[] demoArr = { 1000, 1290, 440, 8740, 5647 };
    int n = 5;
    double sum = 0;
    double avg;
    Scanner keyboard = new Scanner(System.in);
    do {
      System.out.print("1. Custom array\n2. Demo array\nSelect: ");
      int option = keyboard.nextInt();
      switch (option) {
        case 1:
          System.out.print("Number of elements: ");
          n = keyboard.nextInt();
          arr = new int[n];
          System.out.print("Enter elements: ");
          for (int i = 0; i < n; i++) {
            arr[i] = keyboard.nextInt();
            sum += arr[i];
          }
          break;
        case 2:
          arr = demoArr;
          for (int i = 0; i < n; i++) {
            sum += arr[i];
          }
          break;
        default:
          System.out.println("Invalid. Try again.");
          continue;
      }
      break;
    } while (true);
    Arrays.sort(arr);
    avg = sum / n;
    System.out.println("Sorted array: " + Arrays.toString(arr));
    System.out.println("Sum = " + sum);
    System.out.println("Average = " + avg);
    keyboard.close();
    System.exit(0);
  }
}
