
public class day6p3 {
	public static void main(String[] args) {
		int i ;
		int j;
		int n= 5;
		for(i=1; i<=n; i++)
		{
			for(j=1; j<=i; j++)
			{
				if(i==1 || i==5 || j==1 || j==i)
				{
					System.out.print("*" + " ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
			
		}
	}
}

