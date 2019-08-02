import java.util.Scanner;
class Main{
		public static void main (String[] args){
	  Scanner in = new Scanner (System.in);
      int num1 = in.nextInt();
      int num2 = in.nextInt();
      int num3 = in.nextInt();
      int first_greatest = greatest_of_2numbers (num1,num2);
      if (first_greatest > num3)
      {
        System.out.println(first_greatest);
      }
      else
      {
        System.out.println(num3);
      }
 }       
  public static int greatest_of_2numbers (int d_num1, int d_num2)
  {
    if ( d_num1 > d_num2)
    {
      return d_num1;
    }
    else 
    {
      return d_num2;
    }
  }
}