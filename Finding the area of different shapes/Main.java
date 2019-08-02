import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner in = new Scanner (System.in);
        int choice = in.nextInt();
        double pi = 3.14;
        //double answer = 1;
        int ans = 1;
        switch (choice)
        {
          case 1 :
          int side = in.nextInt();
          ans = side* side ;
          System.out.println(ans);
          break ;
          case 2:
          int length = in.nextInt();
          int breadth = in.nextInt();
          ans =length * breadth ;
          System.out.println(ans);
          break;
          case 3:
          int base = in.nextInt();
          int height = in.nextInt();
          ans =  (base*height)/2 ;
          System.out.println(ans);
          break;
          case 4:
          int radius =in.nextInt();
          double answer = radius*pi*radius ;
          System.out.println(answer);
          break;
          default :
          System.out.println("Invalid choice");
          break; 
    }
    }
}