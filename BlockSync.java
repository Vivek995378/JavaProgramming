class MathClass{
	void printNumbers(int n) throws InterruptedException
	{
		synchronized(this)
		{
			for(int i=1;i<=n;i++)
			{
				System.out.println(Thread.currentThread().getName() + "::"+ i);
				Thread.sleep(500);
			}
		}
	}
}
class BlockSync {
	public static void main(String args[])
	{
		final MathClass mc = new MathClass();
		Runnable r = new Runnable()
		{
			public void run()
			{
				try{
					mc.printNumbers(3);
				}catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		};
		new Thread(r,"ONE").start();
		new Thread(r,"TWO").start();
	}
}