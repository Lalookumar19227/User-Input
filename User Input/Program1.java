import java.util.Scanner;
class Program1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the 1st Number: ");
		int x=sc.nextInt();

		System.out.println("ENter the 2nd Number: ");
		int y=sc.nextInt();
		int sum=x+y;
		System.out.println("The sum of "+x+" and "+y+" is: "+sum);			
	}
}