import java.io.*;
class ExampleThrows
{
	void myMethod(int num) throws IOException,ClassNotFoundException
	{
		if(num==1)
			throw new IOException("IOException occurs");
		else
			throw new ClassNotFoundException("ClassNotFoundException occurs");
	}
}
class ExceptionHandlingThrows extends ExampleThrows
{
	public static void main(String args[])
	{
		try{
			ExceptionHandlingThrows obj = new ExceptionHandlingThrows();
			obj.myMethod(3);
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}