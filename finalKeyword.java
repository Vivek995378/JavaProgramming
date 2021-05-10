// Using final keyword to prevent overriding
class Demo
{
   // final int a=30;  ->This statement will give compile time error
	int a=30;
	public void change()
	{
		a=50;
	}
}
class finalKeyword extends Demo
{
	public static void main(String args[])
	{
		finalKeyword obj = new finalKeyword();
		obj.change();
		System.out.println("Value of a is:-"+obj.a);
	}
}
