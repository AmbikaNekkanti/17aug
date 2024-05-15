
public class A 
{
	int a;
	float b;
	boolean c;
}
class H
{
	public static void main(String[]args)
	{
		A d=new A();
		System.out.println(d.a);
		System.out.println(d.b);
		System.out.println(d.c);
		d.a=100;
		d.b=45.5f;
		d.c=true;
		System.out.println(d.a);
		System.out.println(d.b);
		System.out.println(d.c);
		
		
	}
}
