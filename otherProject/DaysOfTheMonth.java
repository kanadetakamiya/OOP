import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

public class DaysOfTheMonth {
  public static void main(String[] args) {
    Dictionary<String, Integer> month = new Hashtable<>();
    month.put("1", 1);
    month.put("2", 2);
    month.put("3", 3);
    month.put("4", 4);
    month.put("5", 5);
    month.put("6", 6);
    month.put("7", 7);
    month.put("8", 8);
    month.put("9", 9);
    month.put("10", 10);
    month.put("11", 11);
    month.put("12", 12);
    month.put("January", 1);
    month.put("February", 2);
    month.put("March", 3);
    month.put("April", 4);
    month.put("May", 5);
    month.put("June", 6);
    month.put("July", 7);
    month.put("August", 8);
    month.put("September", 9);
    month.put("October", 10);
    month.put("November", 11);
    month.put("December", 12);
    month.put("Jan", 1);
    month.put("Feb", 2);
    month.put("Mar", 3);
    month.put("Apr", 4);
    month.put("May", 5);
    month.put("Jun", 6);
    month.put("Jul", 7);
    month.put("Aug", 8);
    month.put("Sep", 9);
    month.put("Oct", 10);
    month.put("Nov", 11);
    month.put("Dec", 12);
    month.put("Jan.", 1);
    month.put("Feb.", 2);
    month.put("Mar.", 3);
    month.put("Apr.", 4);
    month.put("May.", 5);
    month.put("Jun.", 6);
    month.put("Jul.", 7);
    month.put("Aug.", 8);
    month.put("Sep.", 9);
    month.put("Oct.", 10);
    month.put("Nov.", 11);
    month.put("Dec.", 12);
    Scanner keyboard = new Scanner(System.in);
    int getMonth;
    int days = 0;
    int year = 0;
    do {
      System.out.println("Month?");
      String strMonth = keyboard.nextLine();
      System.out.println("Year?");
      if (!keyboard.hasNextInt() || month.get(strMonth) == null) {
        keyboard.nextLine();
        System.out.println("Date invalid. Try again.");
        continue;
      }
      year = keyboard.nextInt();
      if (year < 1000) {
        keyboard.nextLine();
        System.out.println("Date invalid. Try again.");
        continue;
      }
      getMonth = month.get(strMonth);
      break;
    } while (true);
    switch (getMonth) {
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
        days = 31;
        break;
      case 4:
      case 6:
      case 9:
      case 11:
        days = 30;
        break;
      case 2:
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
          days = 29;
        else
          days = 28;
        break;
    }
    System.out.println("There are " + days + " days on " + getMonth + "/" + year);
    keyboard.close();
    System.exit(0);
  }
}