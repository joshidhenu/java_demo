package pattern;

public class pr19 {

	public static void main(String[] args) {
		int num,n=5;
		for(int i=1;i<=n;i++)
		{
			num=1;
			for(int j=1;j<=i;j++)
			{
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}

}
