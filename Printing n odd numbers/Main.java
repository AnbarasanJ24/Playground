import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int temp = 1;
      for (int i=1;temp<=num;i++)
      {
        if (i%2 == 1)
        {
          System.out.println(i);
          temp=temp+1;
        }
        
	}
}
}