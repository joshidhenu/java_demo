package pattern;

public class pr5 {
	public static void pattern5(int n) {
		for (int i = 1; i <= n; i++) {
			for (int k = 1; k <=i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (n-i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		int n = 5;
		pattern5(n);
	}

}
