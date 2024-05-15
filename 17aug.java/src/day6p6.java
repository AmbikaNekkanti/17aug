
public class day6p6 {
public static void main(String[] args) {
	int i;
	int j;
	int n=5;
	for(i=1; i<=n; i++)
	{
		for(j=1; j<=((n+1)-i);j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}
}
