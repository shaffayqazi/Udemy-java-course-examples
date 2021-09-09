import java.util.Scanner;
public class PyramidPattern{

    public static void main(String[] args) {
    int k = 0;
    System.out.println("Enter the height of the pyramid: ");
    Scanner sc = new Scanner(System.in);
    int rows = sc.nextInt();
      for (int i = 1; i <= rows; ++i, k = 0) {
        for (int space = 1; space <= rows - i; ++space) {
          System.out.print("  ");
        }
  
        while (k != 2 * i - 1) {
          System.out.print("* ");
          ++k;
        }
  
        System.out.println();
      }
    }
  }