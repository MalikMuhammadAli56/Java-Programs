class ABC
{
	static int a=100;

	void fun()
	{
		int b=12;
		++a;
	}
}

public class Static1
{
	public static void main(String args[])
	{
		ABC obj1=new ABC();
		System.out.println("Static variable="+ABC.a);
	obj1.fun();
		System.out.println("Static variable="+ABC.a);
	}
}