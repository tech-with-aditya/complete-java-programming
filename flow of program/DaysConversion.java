public class DaysConversion {
  public static void main(String[] args) {
    int days = 459;
    int weeks, years;
    years = days / 365;
    weeks = (days % 365) / 7;
    days = (days % 365) % 7;
    System.out.println(years);
    System.out.println(weeks);
    System.out.println(days);
  }
}
