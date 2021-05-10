class A{
	synchronized void addNew(int n){
		Thread t = Thread.currentThread();
		try{
			for(int i=1;i<=5;i++)
			{
				System.out.println(t.getName()+":"+(i+n));
				t.sleep(500);
			}
		}catch(InterruptedException e)
		{
			System.out.println("Thread Interrupted");
		}
	}
}
class B extends Thread{
	A a1 = new A();
	public void run()
	{
		a1.addNew(100);
	}
}
class MethodSync{
	public static void main(String args[]){
		B b = new B();
		Thread t1 = new Thread(b);
		Thread t2 = new Thread(b);
		t1.setName("T1");
		t2.setName("T2");
		t1.start();
		t2.start();
	}
}