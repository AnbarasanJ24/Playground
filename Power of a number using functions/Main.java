import java.util.Scanner;
public class Main
{
    public static void main ( String[] args)
  {
    Scanner in = new Scanner (System.in);
    int base = in.nextInt();
    int exponent = in.nextInt();
    int result = power (base,exponent);
    System.out.println(result);
  }
public static int power ( int a, int b)
{
  if ( b != 0)
    return ( a * power (a,(b-1)));
  else
    return 1;
}
}