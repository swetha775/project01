package WrapperClasses;


public class BoxingAndUnBoxing<T> //Bound
{
	public T display(T x)
	{
		return x;
	}
		public static void main(String[] args) 
	{
			//Boxing
			int x = 20;
			Integer y = Integer.valueOf(x); //Manual Boxing
			Integer z = x;                 //Auto Boxing
			System.out.println("Using Boxing: "+y);
			
			//UnBoxing
			int a = z.intValue(); //Manual UnBoxing
			int b = y;           //Auto UnBoxing
			System.out.println("Using UnBoxing: "+b);
			
			BoxingAndUnBoxing<Integer> obj = new BoxingAndUnBoxing<>();
			Integer res = obj.display(21);
			System.out.println("Using Genreic: "+res);
			
			BoxingAndUnBoxing<Byte> obj1 = new BoxingAndUnBoxing<>();
			Byte r = 10;
			Byte res1 = obj1.display(r);
			System.out.println("Using Genreic: "+res1);
			
		

	}

}
