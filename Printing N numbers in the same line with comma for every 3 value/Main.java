import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    Scanner in = new Scanner (System.in);
    int num = in.nextInt();
    int m = 3;
    for (int num_count = 1; num_count <= num ; num_count ++)
    {
      System.out.print(num_count);
      if ((num_count % m ==0) && (num_count != num))
          {
            System.out.print(",");
          }
          }
  }
}