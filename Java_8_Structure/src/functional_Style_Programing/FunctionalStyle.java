package functional_Style_Programing;

@FunctionalInterface
interface Sample 
{
	void add();          //Only Single Abstract Method allowed
	
	String toString();
	
	int hashCode();
	
	default void sub()
	{
		System.out.println("Default Modifer Allowed in Interface");
	}
	
	static void mul() 
	{
		System.out.println("Static Method Allowed in Interface");
	}
	
}

interface Sample1 extends Sample
{
	
}

class Demo implements Sample1
{
	int x =1;

	@Override
	public void add() 
	{
		System.out.println("heloo world");
	}
	
	public int getvalue() 
	{
		//x++;
		return x;
		
	}
	
	public String toString()
	{
		return "toString method";
		
	}

}


public class FunctionalStyle
{
	public static void display(Sample obj)
	{
		obj.add();
		System.out.println(obj.toString());
		obj.sub();
		Sample.mul();
	}
	
	public static void main(String[] args) 
	{
		Demo obj = new Demo();  // Imperative
		//display(obj);  
		
		display(()->System.out.println("hii Swetha.."));  //Declarative Using Lambda
		
		System.out.println(obj.getvalue());  //2 -> Impure Function
		
		System.out.println(obj.getvalue());  //1 -> Pure Function
		
		
	

	}

}
