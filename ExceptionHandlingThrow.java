class ExceptionHandlingThrow
{
    void validate(int age)
    {
    	if(age<18)
    	{
    		throw new ArithmeticException("not valid age for voting");
    	}
    	else
    	{
    		System.out.println("Welcome to vote");
    	}
    }
	public static void main(String args[])
	{
		ExceptionHandlingThrow obj = new ExceptionHandlingThrow();
		obj.validate(13);
		System.out.println("Rest of the code");

	}
}