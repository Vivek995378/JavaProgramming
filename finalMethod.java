class Demo
{
	final void finalMethod1()
	{
		System.out.println("This is final method");
	}
}
class finalMethod extends Demo 
{
	void finalMethod1()
	{
		System.out.println("This will cause compilation error");
	}
	
}