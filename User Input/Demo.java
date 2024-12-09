
class Demo
{
	static int x=45;
		int y=60;
	public static void run()
	{
		System.out.println("Run method");
	}
	public  void start()
	{
		System.out.println("STart method");
	}
	public static void main(String[] args)
	{
		System.out.println("This is main method");
		System.out.println("x is: "+Demo.x);
		Demo.run();
		Demo d1=new Demo();
		System.out.println("y is: "+d1.y);
		d1.start();		
	}
}






