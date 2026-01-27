package Thread;

class Train
{
	private int seat = 10;
	
	public synchronized void bookSeat(int seatCount)
	{
		if(seat == 0) 
		{
			System.out.println(Thread.currentThread().getName()+"The Seat is Waiting...");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		if(seat >= seatCount)
		{
			System.out.println(Thread.currentThread().getName()+" - before seatCount "+seat);
			seat -= seatCount ;
			System.out.println(Thread.currentThread().getName()+" - Ticket is Booked Succesfully..."+"BookedSeat :"+seatCount);
			
		}
		else
		{
			System.out.println(Thread.currentThread().getName()+" - Sorry! Ticket is not Booked..."+"BookedSeat :"+seatCount);

		}
		System.out.println(Thread.currentThread().getName()+" - after seatCount "+seat);
		

	}
	
	public synchronized void cancelSeat(int seatCount)
	{
		
		System.out.println(Thread.currentThread().getName()+"The Seat is Cancelled..");
		seat += seatCount ;
		notifyAll();
	}
	
	public void displaySeatBook()
	{
		System.out.println("Available seats are :"+ seat);
	}
	
}

class Person implements Runnable
{
	private Train train2;
	private int seatCount;
	private Boolean isCancel;
	
	public Person(Train train2 , 	int seatCount ,Boolean isCancel) 
	{
		this.train2 = train2;
		this.seatCount = seatCount;
		this.isCancel = isCancel;
	}


	@Override
	public void run() 
	{
		/*if(seatCount == 2)
		{
			isCancel = true;
		}
		else
		{
			isCancel = false;
		}*/
		
		if(isCancel)
		{
			train2.bookSeat(seatCount);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			train2.cancelSeat(seatCount);
		}
		else
		{
			train2.bookSeat(seatCount);
		}
	}
}

public class sysnchronizeTask {

	public static void main(String[] args) throws InterruptedException 
	{
		Train train = new Train();
		
		Person p1 = new Person(train , 10 , true);  //0
		Person p2 = new Person(train , 3 , false);  //1
		Person p3 = new Person(train , 6 , false);   //2
			
		Thread person1 = new Thread(p1);
		Thread person2 = new Thread(p2);
		Thread person3 = new Thread(p3);

		
		person1.start();
		person2.start();
		person3.start();
		
		person1.join();
		person2.join();
		person3.join();
		
		
		train.displaySeatBook();




		

	}

}
