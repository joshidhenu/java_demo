package pattern;

public class pr15 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=(n-i);k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		n=4;
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=i;k++)
			{
			System.out.print(" ");
			}
			for(int j=1;j<=(n+1)-i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
