class A
{
	void show()
	{
	    System.out.println("Class A show Method");
	}
}
class B extends A
{
	void show()
	{
		super.show();
	    System.out.println("Class B show Method");
	}
}
class methodOverriding1
{
	public static void main(String args[])
	{
	    B obj = new B();
	    obj.show();
	}
}