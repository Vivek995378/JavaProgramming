class X extends Thread{
	public void run()
	{
		System.out.println("Thread X started");
		for(int i=0;i<5;i++)
		{
			System.out.println("\t value of i in thread X : "+ i);
		}
		System.out.println("Thread X finished");
	}
}
class Y extends Thread
{
	public void run()
	{
		System.out.println("Thread Y started");
		for(int i=0;i<5;i++)
		{
			System.out.println("\t value of i in Thread Y : "+i);
		}
		System.out.println("Thread Y finished");
	}
}
class Z extends Thread
{
	public void run()
	{
		System.out.println("Thread Z started");
		for(int i=0;i<5;i++)
		{
			System.out.println("\t value of i in Thread Z : "+i);
		}
		System.out.println("Thread Z finished");
	}
}
class MultiThreading4
{
	public static void main(String args[])
	{
		System.out.println("Main thread started.");
		X threadX = new X();
		Y threadY = new Y();
		Z threadZ = new Z();
		threadZ.setPriority(Thread.MAX_PRIORITY);
		threadY.setPriority(threadX.getPriority()+1);
		threadX.setPriority(Thread.MIN_PRIORITY);
		threadX.start();
		threadY.start();
		threadZ.start();
		try{
			threadX.join();
			threadY.join();
			threadZ.join();
		}catch(InterruptedException e){}
		System.out.println("Main thread finished.");
	}
}