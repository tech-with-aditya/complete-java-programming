public class Circle {
  public static void main(String[] args) {

    double r = 9; // radius
    double pi = 3.14;
    double dm, cf, area;

    dm = 2 * r; // diameter
    cf = 2 * pi * r; // circumference
    area = pi * r * r;

    System.out.println("The diameter of the circle is " + dm + " units");
    System.out.println("The circumference of the circle is " + cf + " units");
    System.out.println("The area of the circle is " + area + " sq. units");
  }
}
