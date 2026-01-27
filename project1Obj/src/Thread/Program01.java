package Thread;

class Task01
{
	void printTable(int x)
	{
		for(int i = 1 ; i <= 10 ; i++ )
		{
			//System.out.println(i+"x"+x+"="+i*x+Thread.currentThread().getName());
			System.out.println(i+Thread.currentThread().getName());

		}
	}
}

class Thread01 implements Runnable
{
	Task01 task01;
	public Thread01(Task01 task01)
	{
		this.task01 = task01;
	}
	
	@Override
	public void run() {
		//task01.printTable(3);
		for(int i = 1 ; i <= 5 ; i++)
		{
			System.out.println(i+Thread.currentThread().getName());
			//try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
			Thread.yield();
		}
	}
}

class Thread02 implements Runnable
{
	
	@Override
	public void run()
	{
		for(int i = 1 ; i <= 5 ; i++)
		{
			System.out.println(i+Thread.currentThread().getName());
			//System.out.println(Thread.currentThread().isAlive());
			

		}
	}
}

public class Program01 
{
	public static void main(String[] args) throws InterruptedException
	{
		Task01 task1 = new Task01();  // common resource
		
		Thread01 t1 = new Thread01(task1);
		Thread thread1 = new Thread(t1);
		//thread1.setPriority(Thread.MAX_PRIORITY);
		//System.out.println(thread1.getPriority());
		thread1.setName("frist thread");
		thread1.start();              // user defined new thread-1
		thread1.join();               //timed waiting
		//System.out.println(thread1.getState());  // TERMINATED state
		
		
		Thread02 t2 = new Thread02();
		Thread thread2 = new Thread(t2);    
		//System.out.println(thread2.getState()); //NEW state
		//thread2.setPriority(Thread.MIN_PRIORITY);
		//System.out.println(thread2.getPriority());
		
		thread2.start();              //user defined new thread-2
		//System.out.println(thread2.getState());  // RUNNABLE state
		//System.out.println(thread2.isAlive());

		
		
		
		
	}
	

}
