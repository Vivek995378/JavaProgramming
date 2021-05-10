abstract class A
{
	void display()
	{
		System.out.println("This is abstract class non-abstract method");
	}
}
class B extends A
{
	void show()
	{
		System.out.println("This is sub class method");
	}
}
class abstract1
{
	public static void main(String args[])
	{
		B obj = new B();
		obj.show();
		obj.display();
	}
}