package Thread;

class Res
{
	public synchronized void print(String str) throws InterruptedException
	{
		for(int i = 0 ; i<=10 ; i++)
		{
			System.out.println(Thread.currentThread().getName()+""+str+""+i);
			notify();
			wait();
		}
		notify();
		
	}
}

class One implements Runnable
{
	Res res;
	String str;
	public One(Res res , String str)
	{
		this.res = res;
		this.str = str;
	}

	@Override
	public void run() 
	{
		try {
			res.print(str);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Two implements Runnable
{
	Res res;
	String str;
	public Two(Res res , String str)
	{
		this.res = res;
		this.str = str;
	}

	@Override
	public void run() 
	{
		try {
			res.print(str);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}



public class InterThreadCommunication 
{
	public static void main(String[] args) 
	{
		Res r = new Res();
		
		One t1 = new One(r, "one");
		Two t2 = new Two(r , "two");
		
		Thread thr1 = new Thread(t1);
		Thread thr2 = new Thread(t2);
		
		thr1.start();
		thr2.start();

	}

}
