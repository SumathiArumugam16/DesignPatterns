package Design_Patterns;

public class Pattern_Decreasing_Traingle  {

	public static void main(String[] args) {
		pattern_decreasing_traingle(5);

	}
	static void pattern_decreasing_traingle(int n)
	{

		for(int i=1 ; i<=n ; i++)
		{

			for(int j=i ; j<=n ; j++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}



//i=1 * * * *
//i=2 * * * 
//i=3 * *
//i=4 * 