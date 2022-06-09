import java.util.Scanner;
public class GradeProgram1
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);

		System.out.println("Enter Marks of 5 Sujects=");

		float sub1=in.nextFloat();
		float sub2=in.nextFloat();
		float sub3=in.nextFloat();
		float sub4=in.nextFloat();
		float sub5=in.nextFloat();

		float total,average,percentage;
		char grades='0';  // or null char:- '\0' .  or initialize with any char e.g: 'A'  .

		total=sub1+sub2+sub3+sub4+sub5;
		average=total/5;
		percentage=(total/500)*100;


		if(percentage>=90 && percentage<=100)
			{
			grades='A';
			}
		if(percentage>=80 && percentage<=89)
			{
			grades='B';
			}
		if(percentage>=70 && percentage<=79)
			{		
			grades='C';
			}
		if(percentage>=60 && percentage<=69)
			{
			grades='D';
			}
		if(percentage>=50 && percentage<=59)
			{
			grades='E';
			}			
		if(percentage<=49)
			{
			grades='F';
			}
		System.out.println("Total Marks="+total);
		System.out.println("Average="+average);
		System.out.println("Percentage="+percentage);
		System.out.println("Grades="+ grades);		

	}
}