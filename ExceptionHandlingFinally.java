class ExceptionHandlingFinally
{
	public static void main(String args[])
	{
		try{
			int num=121/0;
			System.out.println("Try block executes successfully");
		}catch(ArithmeticException e)
		{
			System.out.println("Number divide by 0");
		}
		finally{
			System.out.println("This is finally block");
		}
		System.out.println("Out of try-catch-finally block");
	}
}