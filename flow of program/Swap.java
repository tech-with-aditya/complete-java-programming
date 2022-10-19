public class Swap {
  public static void main(String[] args) {
    int num1 = 2;
    int num2 = 3;
    System.out.println("Numbers before swapping!");
    System.out.println("First number: " + num1);
    System.out.println("Second number: " + num2);
    int temp = num1;
    num1 = num2;
    num2 = temp;
    System.out.println("\nNumbers after swapping!");
    System.out.println("First number: " + num1);
    System.out.println("Second number: " + num2);
  }
}
