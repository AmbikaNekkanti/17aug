
public class day6p5 {
	public static void main(String[] args) {
		int i;
		int k;
		int j;
		int n=5;
		for(i=1;i<=n;i++)
		{
			for(k=1; k<=n-i; k++)
			{
				System.out.print(" ");
			}
			for(j=1; j<=i; j++)
			{
				if(i==1 || i==n || j==1 || j==i)
				{
					System.out.print(i + " ");
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
