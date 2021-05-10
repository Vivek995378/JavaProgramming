class A{
	public synchronized void fun1(B objB){
		System.out.println("Thread 1 start execution of fun1");
		try{
			Thread.sleep(2000);
		}catch(InterruptedException e){}
		System.out.println("Thread 1 trying to call b.last() method");
		objB.last();
	}
	public synchronized void last()
	{
		System.out.println("Inside class A,this is last( method");
	}
}
class B{
	public  void fun2(A objA){
		System.out.println("Thread 2 start execution of fun2");
		try{
			Thread.sleep(2000);
		}catch(InterruptedException e){}
		System.out.println("Thread 2 trying to call a.last() method");
		objA.last();
	}
	public synchronized void last()
	{
		System.out.println("Inside class B,this is last( method");
	}
}
class Deadlock implements Runnable
{
	A a = new A();
	B b = new B();
	Deadlock()
	{
		Thread t = new Thread(this);
		t.start();
		a.fun1(b);
	}

	public void run()
	{
		b.fun2(a);
	}
	public static void main(String args[])
	{
		new Deadlock();
	}
}