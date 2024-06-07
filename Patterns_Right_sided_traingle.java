package Design_Patterns;

public class Patterns_Right_sided_traingle {


	public static void main(String[] args) {

		patterns_right_sided_traingle(5);
	}
	static void patterns_right_sided_traingle(int n)
	{
		for (int i = 1 ; i<=n ;i++)
		{
			for (int j=i ; j<=n ; j++)
			{
				System.out.println("");
			}
			for (int j=1 ; j<=n ; j++)
			{
				System.out.println("* ");
			}
			System.out.println("");
		}
		
	}
}


//R=1 ----* 1st decreasing "----" and increasing in "*"
//R=2 ---**
//R=3 --***
//R=4 -****
//R=5 *****