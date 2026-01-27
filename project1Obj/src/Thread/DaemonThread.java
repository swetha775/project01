package Thread;

class DaemonService implements Runnable
{
	
	@Override
	public void run() 
	{
		while(true)
		{
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" Saving ");
			
		}
		
	}
	
}

class DaemonServiceSpell implements Runnable
{
	
	@Override
	public void run() 
	{
		while(true)
		{
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" check Spelling ");
			
		}
		
	}
	
}
class UserDefinedThread implements Runnable
{

	@Override
	public void run() 
	{
		for(int i = 0 ; i <= 10 ; i++)
		{
			System.out.println(Thread.currentThread().getName()+"Typing.....");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

public class DaemonThread 
{
	public static void main(String[] args)
	{
		DaemonService daemon = new DaemonService();
		DaemonServiceSpell daemonspell = new DaemonServiceSpell();
		UserDefinedThread thr1 = new UserDefinedThread();

		Thread t2 = new Thread(thr1);
		Thread t1 = new Thread(daemon);
		Thread t3 = new Thread(daemonspell);

		
		t1.setName("Daemon");
		t3.setName("Daemon-1");
		t1.setDaemon(true);
		t3.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
		
	}


}
