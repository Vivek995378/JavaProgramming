class ExceptionHandling
{
	public static void main(String args[])
	{
		try
		{
			int data = 100/0;
			System.out.println("This line will not be print");
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("Rest of the code will execute as per instructions");
	}
}