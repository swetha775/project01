package WrapperClasses;

class Program01 <R ,E>                                          //Class level Generic
{
	public R getElement(E element)
	{
		return null;
	}
}

class Program02
{
	public static <T extends Number > void printvalue(T type)     // Method level Generic
	{
		System.out.println("Static Level Genric "+type);
	}
	
}

//Achieve Arithmetic Operation in Generic
class Program03 <T extends Number>     //InnerBound
{
	public Float display(T x , T y)
	{
		//System.out.println(x + y);  //Not directly support arithmetic operation
		Double a = x.doubleValue();
		Double b = y.doubleValue();
		double res = a + b;            //supported
		
		return (float) res;
		
	}
}

//Achieve Array in Generic
class Program04 <T extends Number>
{
	public Integer findTotal(T[] arr)
	{
		int total = 0;
		//T[] arr = new T[];     //cannot support generic to array
		for(T i : arr)
		{
			total += i.intValue();
		}
		return total;
	}
	
}

public class GenricClass <R extends Number  , E>
{
	public static void main(String[] args) 
	{
		Program01<Integer , String> obj = new Program01<>();
		Integer res = obj.getElement("swe");
		System.out.println("Class level Generic: "+res);
		
		Program02.printvalue(45);
		
		Program03<Integer> obj1 = new Program03<>();
		Float result = obj1.display(32, 2);
		System.out.println("Arithmetic Operation in Generic: "+result);
		
		Integer[] arr1 = new Integer[] {2,4,5};
		Program04<Integer> ob = new Program04<>();
		Integer res1 = ob.findTotal(arr1);
		System.out.println("Using Array in Generic: "+res1);
		

	}

}
