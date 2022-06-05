import java.util.Scanner;
class Dog
{

 String color="BLACK";

 String name="JACO";
 String b="Barking";

void Sleeping()
{

 System.out.println("\n");
 System.out.println("Dog is Sleeping ");
}

void fun()
{
  int x,y;
//System.out.println(x);

//System.out.println(y);
}


}

public class Demo1
{
  public static void main(String args[])
  {
	Scanner sc= new Scanner(System.in);
     int i,size;
   Dog d1;
   d1= new Dog();

 System.out.println(d1.color);

 System.out.println(d1.name);
 
 System.out.println(d1.b);

d1.Sleeping();
d1.fun();

size= sc.nextInt();

for(i=0;i<
size;i++)
  { 
    System.out.println(i);
  }

for(i=0;i<=5;i++)
  { 
    System.out.println(i);
  }
}


}


 