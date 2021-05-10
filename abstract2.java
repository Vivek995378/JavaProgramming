abstract class A
{
	public void disp()
	{
		System.out.println("Concrete method of parent class");
	}
	abstract public void disp1();
}
class abstract2 extends A
{
	public void disp1()
	{
		System.out.println("Overriding abstract method");
	}
	public static void main(String args[])
	{
		abstract2 obj = new abstract2();
		obj.disp1();
		obj.disp();
	}
}