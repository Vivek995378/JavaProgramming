class A
{
	A(int n)
	{
		System.out.println("Class A constructor "+n);
	}
}
class B extends A
{
	B(int n)
	{
		super(n);
		System.out.println("Class B constructor "+n);
	}
}
class C extends B
{
	C(int n)
	{
		super(n);
		System.out.println("Class C constructor "+n);
	}
}
class parameterConstructorInInheritance
{
	public static void main(String args[])
	{
		C obj = new C(5);
	}
}