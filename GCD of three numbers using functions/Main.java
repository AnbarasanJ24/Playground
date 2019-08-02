import java.util.Scanner;
public class Main{
	public static void main (String[] args)
{
	    Scanner in = new Scanner (System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
	    int num3 = in.nextInt();
        int first_result= gcd_of_2numbers(num1,num2);
        int final_result= gcd_of_2numbers(first_result,num3);
        System.out.println(final_result);
}
     public static int gcd_of_2numbers( int d_num1,int d_num2)
    {
      int min_element,gcd =0 ;
      if (d_num1 < d_num2)
      {
        min_element = d_num1;
      }
      else
      {
        min_element = d_num2;
      }
      while (min_element >= 1)
      {
        if ((d_num1 % min_element == 0) && (d_num2 % min_element == 0)) 
        {
          gcd = min_element;
          break ;
        }
        min_element--;
      }
        return gcd;
    }
}