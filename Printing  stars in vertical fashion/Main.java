import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    
   Scanner in = new Scanner (System.in);
   int num = in.nextInt();
    for (int star_count = 1; star_count <= num ; star_count ++)
    {
      System.out.println("*");     
  }
  }
}