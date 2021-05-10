class Super
{
	void superMethod()
	{
		System.out.println("This is super class method");
	}
}
class sub extends Super
{
	void subMethod()
	{
		System.out.println("This is sub class method");
	}
}
class singleInheritance
{
	public static void main(String args[])
	{
		sub obj = new sub();
		obj.subMethod();
		obj.superMethod();
	}
}