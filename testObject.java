class test
{
	double a;
	test(int x)
	{
		a=x;
	}
	double max(test ob)
	{
		if(a>=ob.a)
			return a;
		else
			return ob.a;
	}
}
class testObject
{
	public static void main(String args[]) 
	{
		test obj1 = new test(10);
		test obj2 = new test(7);
		double maximum = obj1.max(obj2);
		System.out.println("Maximum number is:-"+maximum);
	}
}