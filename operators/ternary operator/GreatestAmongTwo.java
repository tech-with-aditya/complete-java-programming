import java.util.Scanner;

public class GreatestAmongTwo {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int num1, num2, max;
    System.out.print("Enter the first number: ");
    num1 = in.nextInt();
    System.out.print("Enter the second number: ");
    num2 = in.nextInt();
    max = (num2 > num1) ? num2 : num1;
    System.out.println(max);
  }
}
