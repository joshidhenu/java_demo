package pattern;

public class pr3 {
	public static void pattern3(int n) {
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=(n+1)-i;j++)
			{
			System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int n =5;
		pattern3(n);

	}

}
