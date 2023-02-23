package pattern;

public class pr4 {
	public static void pattern4(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
			System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();

			}
		}
	

	public static void main(String[] args) {
		int n=5;
		pattern4(n);
	}

}
