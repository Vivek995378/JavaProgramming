class A
{
	A()
	{
		System.out.println("Class A constructor");
	}
}
class B extends A
{
	B()
	{
		System.out.println("Class B constructor");
	}
}
class C extends B
{
	C()
	{
		System.out.println("Class C constructor");
	}
}
class constructorInInheritance
{
	public static void main(String args[])
	{
		C obj = new C();
	}
}