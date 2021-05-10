class A
{
	int n;
}
class B extends A
{
	int n;
	B()
	{
		super.n=10;   //n of A
		n=20;
	}
	void show()
	{
		System.out.println("variable n of classA :-"+super.n);
		System.out.println("variable n of classB :-"+n);
	}
}
class methodOverriding2
{
	public static void main(String args[])
	{
	    B obj = new B();
	    obj.show();
	}
}