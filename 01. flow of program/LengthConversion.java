public class LengthConversion {
  public static void main(String[] args) {
    double cm = 157; // centimeter
    double mm, m, km;
    mm = cm * 10; // millimeter
    m = cm / 100; // meter
    km = cm / 100000; // kilometer
    System.out.println(mm);
    System.out.println(m);
    System.out.println(km);
  }
}
