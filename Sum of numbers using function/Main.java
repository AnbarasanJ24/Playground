import java.util.Scanner;
class Main{
	public static int sum(int n)
    {
		int sum = 0;
	    for(int i = 1; i<= n; i++)
	    {
	        sum = sum + i;
	    }
	    return sum;
    }
	public static void main (String[] args){
		Main m = new Main();
	    Scanner in = new Scanner(System.in);
	    int n1 = in.nextInt();
	    int ans =m.sum(n1);
	    System.out.println(ans);
	    
	}
}