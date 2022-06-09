class PC
{
	int x,y,z;

	PC(int a, int b, int c)
	{
		x=a;
		y=b;
		z=c;

		System.out.println("X="+x+"\nY="+y+"\nZ="+z);
		System.out.println("sum of X+Y+Z= " +(x+y+z));
	}

}

public class Parameter
{
	public static void main(String args[])
	{
		PC obj1=new PC(12,13,14);
	}
}