package Design_Patterns;

public class Patterns_Square {
	public static void main(String[] args) {
		pattern1_square(5);
	}

	static void pattern1_square(int n)
	{
		for (int i=1; i<=n ; i++)
		{
			for (int j=1 ; j<=n ; j++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

}
