public class CompoundInterest {
  public static void main(String[] args) {
    double p = 25000; // principle amount
    double r = 6; // rate of interest
    double t = 8; // time
    double ci = p * Math.pow((1 + r / 100), t); // compound interest
    System.out.println(ci);
  }
}
