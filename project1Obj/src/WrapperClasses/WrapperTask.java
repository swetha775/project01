package WrapperClasses;

class Program1<T extends Number>
{
	public T add(T x , T y)
	{
		Integer r = x.intValue() + y.intValue();
		return (T) r;
		
	}
	
	public T sub(T a , T b)
	{
		Float f = a.floatValue() - b.floatValue();
		return (T)f;
	}
	
	public T mul(T a ,T b)
	{
		Double d = a.doubleValue() * b.doubleValue();
		return (T)d;
		
	}
	
	public T div(T a , T b)
	{
		Long l = a.longValue() / b.longValue();
		return (T)l;
	}
	
}

class Program2<R extends Number , E extends Number>
{
	public R addition(E x , E y)
	{
		Integer i = x.intValue() + y.intValue();
		return (R)i;
		
	}
	
	public R subraction(E x , E y)
	{
		Double d = x.doubleValue() - y.doubleValue();
		return (R)d;	
	}
	
	public R multi(E x , E y)
	{
		Long l = x.longValue() * y.longValue();
		return (R)l;	
	}
	
	public R divide(E x , E y)
	{
		Short s = (short) (x.shortValue() / y.shortValue());
		return (R)s;	
	}
	
	
}

class Program3<T extends Number>
{
	
	public Integer findTotal(T[] arr)
	{
		int total = 0;
		for(T i:arr)
		{
			total += i.intValue();
		}
		
		return total;
	}
	
}



public class WrapperTask
{
	public static void main(String[] args) 
	{
		Program1<Integer> obj = new Program1<>();
		Integer res = obj.add(2, 4);
		System.out.println(res);
		
		Program1<Float> obj1 = new Program1<>();
		Float res1 = obj1.sub(20f , 10f);
		System.out.println(res1);
		
		Program1<Double> obj2 = new Program1<>();
		Double res2 = obj2.mul(30.0, 9.0);
		System.out.println(res2);
		
		Program1<Long> obj3 = new Program1<>();
		Long res3 = obj3.div(10l, 2l);
		System.out.println(res3);
		
		Program2<Integer , Float> ob = new Program2<>();
		Integer re = ob.addition(23f, 21f);
		System.out.println(re);
		
		Program2<Double , Integer> ob1 = new Program2<>();
		Double re1 = ob1.subraction(56, 23);
		System.out.println(re1);
		
		Program2<Long , Double> ob2 = new Program2<>();
		Long re2 = ob2.multi(2.0 , 4.0);
		System.out.println(re2);
		
		Program2<Short , Double> ob3 = new Program2<>();
		Short re3 = ob3.divide(4.2, 2.3);
		System.out.println(re3);
		
		Integer[] arr1 = new Integer[] {2,3,4,4};
		Program3 <Integer> result = new Program3<>();
		Integer rep = result.findTotal(arr1);
		System.out.println(rep);




	

	}

}
