package Design_Patterns;

public class Patterns_Increasing_Traingle  {

	public static void main(String[] args) {
		pattern_increase_traingle(5);

	}
	static void pattern_increase_traingle(int n)
	{
		for(int i=1 ; i<=n ; i++)
		{
			for(int j=1 ; j<=i ; j++) 
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}


//i=1 *
//i=2 * *
//i=3 * * *
//i=4 * * * *