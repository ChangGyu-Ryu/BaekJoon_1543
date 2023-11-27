import java.util.Scanner;

public class Main {

  /**
   * @param args
   */
  public static void main(String[] args) {
    // TODO Auto-generated method
    Scanner sc = new Scanner(System.in);
    String str1 = sc.nextLine();
    String str2 = sc.nextLine();

    int b = str2.length();
    int count = 0;

    for (int i = 0; i + b <= str1.length(); i++) {

      if (str2.equals(str1.substring(i, i + b))) {
         count++;
         i = i + b - 1;

      }

    }
    System.out.println(count);
  }

}
