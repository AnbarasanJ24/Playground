import java.util.Scanner;
class Main{	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int row = 1 ; row <= n ; row++)
		{
			for(int column = 1 ; column <= row ; column++)
			{
				System.out.print(row);
			}
			System.out.print("\n");
			
		}
	}
}