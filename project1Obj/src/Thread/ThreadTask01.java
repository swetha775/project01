package Thread;

class Thread2 implements Runnable
{
	@Override
	public void run() {
		
		for(int i = 1 ; i <= 5 ; i++)
		{
           System.out.println("two");
           try {Thread.sleep(1100);} catch (InterruptedException e) {e.printStackTrace();}
		}
	}
}

class Thread3 implements Runnable
{
	public void run()
	{
		for(int i = 1 ; i <= 3 ; i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	}
}
public class ThreadTask01 
{
	public static void main(String[] args) throws InterruptedException
	{
		
		Runnable t1 = new Runnable()
		{

			@Override
			public void run() {
				for(int i = 1 ; i <= 5 ; i++)
				{
		           System.out.println("one");
		           try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
				}
				
			}
	
		};

		Thread thread01 = new Thread(t1);
		thread01.start();
		
		
		Thread2 t2 = new Thread2();
		Thread thread02 = new Thread(t2);
		thread02.start();
		thread02.join();
		
		Thread3 t3 = new Thread3();
		Thread thread03 = new Thread(t3);
		thread03.start();
		thread03.join();

		System.out.println(Thread.currentThread().getName());
		



		
		
		
	}

}
