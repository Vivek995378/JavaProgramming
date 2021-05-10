interface A
{
	public void method1();
	public void method2();
}
class interface1 implements A
{
	public void method1()
	{
		System.out.println("Implementation of method 1");
	}
	public void method2()
	{
		System.out.println("Implementation of method 2");
	}
	public static void main(String args[])
	{
		interface1 obj = new interface1();
		obj.method1();
		obj.method2();
	}
}