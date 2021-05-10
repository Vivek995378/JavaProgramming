class Super
{
	void superMethod()
	{
		System.out.println("This is super class method");
	}
}
class SubSuper extends Super
{
	void subSuperMethod()
	{
		System.out.println("This is sub super class method");
	}
}
class Sub extends SubSuper
{
	void subMethod()
	{
		System.out.println("This is sub class method");
	}
}
class multilevelInheritance
{
	public static void main(String args[])
	{
		Sub obj = new Sub();
		obj.subMethod();
		obj.subSuperMethod();
		obj.superMethod();
	}
}