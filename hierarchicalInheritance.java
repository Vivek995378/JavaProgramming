class Super
{
	void superMethod()
	{
		System.out.println("This is super class method");
	}
}
class Sub1 extends Super
{
	void sub1Method()
	{
		System.out.println("This is 1st sub class method");
	}
}
class Sub2 extends Super
{
	void sub2Method()
	{
		System.out.println("This is 2nd sub class method");
	}
}
class hierarchicalInheritance
{
	public static void main(String args[])
	{
		Sub1 obj = new Sub1();
		Sub2 obj1 = new Sub2();
		obj.sub1Method();
		obj.superMethod();
		obj1.sub2Method();
		obj1.superMethod();
	}
}