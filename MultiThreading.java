public class MultiThreading
{
	public static void main(String args[])
	{
		Thread t= Thread.currentThread();
		System.out.println("The current thread is:-"+t);
		t.setName("My thread");
		System.out.println("Thread after name change:-"+t);
		t.setName("Its my thread");
		System.out.println("Name changed:-"+t);
		try{
			for(int i=1;i<=5;i++)
			{
				System.out.println(i);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e)
		{
			System.out.println("Main thread interrupted");
		}
	}
}