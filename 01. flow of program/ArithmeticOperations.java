public class ArithmeticOperations {
  public static void main(String[] args) {

    double num1 = 67;
    double num2 = 43;
    double sum, diff, prod, quot, rem;

    sum = num1 + num2;
    diff = num1 - num2; // difference
    prod = num1 * num2; // product
    quot = num1 / num2;  // quotient
    rem = num1 % num2; // remainder

    System.out.println(num1 + " + " + num2 + " = " + sum);
    System.out.println(num1 + " - " + num2 + " = " + diff);
    System.out.println(num1 + " * " + num2 + " = " + prod);
    System.out.println(num1 + " / " + num2 + " = " + quot);
    System.out.println(num1 + " % " + num2 + " = " + rem);
  }
}
