package Thread;

class Resource01
{
	public synchronized void add(Resource02 resource02)
	{
		System.out.println(Thread.currentThread().getName()+" add - Locked ");
		resource02.sub(this);
	}
}

class Resource02
{
	public synchronized void sub(Resource01 resource01)
	{
		System.out.println(Thread.currentThread().getName()+" sub - Locked ");
		resource01.add(this);
	}
	
}

class Resource03
{
	Resource04 resource04;
	
	public void setR4(Resource04 resource04)
	{
		this.resource04 = resource04;
	}
	
	public synchronized void mul()
	{
		System.out.println(Thread.currentThread().getName()+" mul - Locked ");
		resource04.div();
	}
}

class Resource04
{
    Resource03 resource03;
	
	public void setR3(Resource03 resource03)
	{
		this.resource03 = resource03;
	}
	public synchronized void div()
	{
		System.out.println(Thread.currentThread().getName()+" div - Locked ");
		resource03.mul();
		
	}
}

class Thr01 implements Runnable
{
	Resource01 resource01;
	Resource02 resource02;
	
	public Thr01(Resource01 resource01 , Resource02 resource02)
	{
		this.resource01 = resource01;
		this.resource02 = resource02;
	}

	@Override
	public void run() 
	{
		resource01.add(resource02);
	}
	
}

class Thr02 implements Runnable
{
	Resource02 resource02;
	Resource01 resource01;
	
	public Thr02(Resource02 resource02 , Resource01 resource01)
	{
		this.resource02 = resource02;
		this.resource01 = resource01;
	}

	@Override
	public void run() 
	{
		resource02.sub(resource01);
	}
	
}

class Thr03 implements Runnable
{
	Resource03 resource03;
	Resource04 resource04;
	
	public Thr03(Resource03 resource03 , Resource04 resource04)
	{
		this.resource03 = resource03;
		this.resource04 = resource04;
	}

	@Override
	public void run() 
	{
		resource03.mul();
	}
	
}

class Thr04 implements Runnable
{
	Resource03 resource03;
	Resource04 resource04;
	
	public Thr04( Resource04 resource04,Resource03 resource03 )
	{
		this.resource03 = resource03;
		this.resource04 = resource04;
	}

	@Override
	public void run() 
	{
		resource04.div();
		
	}
	
}

public class DeadLock {

	public static void main(String[] args)
	
	{
		Resource01 resource01 = new Resource01();
		Resource02 resource02 = new Resource02();
		Resource03 resource03 = new Resource03();
		Resource04 resource04 = new Resource04();
		
		resource03.setR4(resource04);
		resource04.setR3(resource03);
		
		Thr01 t1 = new Thr01(resource01 , resource02);
		Thr02 t2 = new Thr02(resource02 , resource01);
		Thr03 t3 = new Thr03(resource03 , resource04);
		Thr04 t4 = new Thr04(resource04 , resource03);


		
		Thread thread1 = new Thread(t1);
		Thread thread2 = new Thread(t2);
		Thread thread3 = new Thread(t3);
		Thread thread4 = new Thread(t4);


		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		
		System.out.println("DeadLock occured....");


		

	}

}
