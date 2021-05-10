import java.io.*;

class ExceptionHandlingReThrow
{
	static void validate(int age)
	{
		try{
			if(age<18)
				throw new ArithmeticException("not a valid age for voting");
			else
				System.out.println("Welcome to voting");
		}catch(ArithmeticException e)
		{
			System.out.println("Exception caught inside function");
			throw e;
		}
	}
	public static void main(String args[]) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int age;
		try{
			System.out.println("Enter your age:-");
			age=Integer.parseInt(br.readLine());
			validate(age);
		}catch(ArithmeticException e)
		{
			System.out.println("Recaught : " + e);
		}
	}
}