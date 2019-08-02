import java.util.Scanner;
class Main{
	public static int sqq(int n)
    {
		int num = n*n;
    	return num;
    }
	public static void main (String[] args){
		Main m = new Main();
	    Scanner in = new Scanner(System.in);
	    int n1 = in.nextInt();
	    int ans =m.sqq(n1);
	    System.out.println(ans);
	    
	}
}