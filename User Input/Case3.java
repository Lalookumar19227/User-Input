import java.util.Scanner;
class Case3
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter Age: ");
		int age=sc.nextInt();
		System.out.println("ENter Name: ");
		sc.nextLine();
		String name=sc.nextLine();
		
		System.out.println("ENter Weight: ");
		double weight=sc.nextDouble();
		System.out.println("ENter Address: ");
		sc.nextLine();
		String add=sc.nextLine();
		

		System.out.println("Your Name is: "+name);
		System.out.println("Your Age is: "+age);	
		System.out.println("Your Weight is: "+weight);	
		System.out.println("Your Address is: "+add);			
	}
}