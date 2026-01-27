package Thread;

class Resource
{

	 public synchronized void display(int x) // non-static synchronized
	{
		for(int i = 1 ; i<=10 ; i++)
		{
			System.out.println(i+"x"+x+"="+i*x+Thread.currentThread().getName());
		}
	}
	 
	public static synchronized void staticDisplay(int x)        // static synchronized
		{
			for(int i=1; i<=10;i++)
			{
				System.out.println(i+"x"+x+"="+i*x+Thread.currentThread().getName());
			}
		}
	
	Integer count = 0;               //non-primitive
	
	public void blockDisplay()                                  //block synchronized
	{
		
		synchronized(count)
		{
			for(int i =0 ; i<=5; i++)
			{
			count += 1;
			System.out.println(count+""+Thread.currentThread().getName());
			}
		}
		synchronized(this)
		{
		System.out.println("Line 1"+Thread.currentThread().getName());
		System.out.println("Line 2"+Thread.currentThread().getName());
		System.out.println("Line 3"+Thread.currentThread().getName());
		System.out.println("Line 4"+Thread.currentThread().getName());

		synchronized(this)
		{
			System.out.println("Line 7");
			System.out.println("Line 8");
			System.out.println("Line 9");
		}
		System.out.println("Line 10"+Thread.currentThread().getName());
		System.out.println("Line 11"+Thread.currentThread().getName());
		}
		System.out.println("Line 5"+Thread.currentThread().getName());
		System.out.println("Line 6"+Thread.currentThread().getName());
			
	}
}
class Thrd01 implements Runnable

{
	//has a relation
	Resource resource;
	public Thrd01(Resource resource)
	{
		this.resource = resource;
	}

	@Override
	public void run() 
	{
		resource.display(5);
	}
}

class Thrd02 implements Runnable

{
	Resource resource;
	public Thrd02(Resource resource)
	{
		this.resource = resource;
	}

	@Override
	public void run() 
	{
		resource.display(8);
	}
}

class Thrd03 implements Runnable
{

	@Override
	public void run() 
	{
		Resource.staticDisplay(2);
	}
}

class Thrd04 implements Runnable
{
	Resource resource;
	public Thrd04(Resource resource)
	{
		this.resource = resource;
	}

	@Override
	public void run() 
	{
		resource.blockDisplay();
	}
	
}
		

public class SysnchronizeThread 
{

	public static void main(String[] args) throws InterruptedException 
	{
		Resource r = new Resource();
		/*
		System.out.println("non-static synchronized...");
		Thrd01 thr1 = new Thrd01(r);
		Thrd02 thr2 = new Thrd02(r);
		
		
		
		Thread t1 = new Thread(thr1);
		Thread t2 = new Thread(thr2);
		
		t1.start();
		t2.start();
		*/
		/*
		System.out.println("static synchronized...");
		Thrd03 thr3 = new Thrd03();
		Thrd03 thr4 = new Thrd03();

		Thread t3 = new Thread(thr3);
		Thread t4 = new Thread(thr3);

		t3.start();
		t4.start();
		*/
		System.out.println("Block synchronized...");
		Thrd04 thr5 = new Thrd04(r);
		Thrd04 thr6 = new Thrd04(r);

		Thread t5 = new Thread(thr5);
		Thread t6 = new Thread(thr5);
		
		
		t5.start();
		t6.start();

	}

}
