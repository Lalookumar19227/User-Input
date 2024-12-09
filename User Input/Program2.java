import java.util.Scanner;
class Program2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the 1st Number: ");
		double x=sc.nextDouble();

		System.out.println("ENter the 2nd Number: ");
		double y=sc.nextDouble();
		double sum=x+y;
		System.out.println("The sum of "+x+" and "+y+" is: "+sum);			
	}
}