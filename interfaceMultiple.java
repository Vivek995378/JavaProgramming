interface A
{
	public void method1();
}
interface B 
{
	public void method2();
}
class interfaceMultiple implements A,B
{
	public void method1()
	{
		System.out.println("Implementation of method1");
	}
	public void method2()
	{
		System.out.println("Implementation of method2");
	}
	public static void main(String args[])
	{
		interfaceMultiple obj = new interfaceMultiple();
		obj.method1();
		obj.method2();
	}
}