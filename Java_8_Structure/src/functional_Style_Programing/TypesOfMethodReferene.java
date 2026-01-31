package functional_Style_Programing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

interface A
{
	void add();
	public static void method (String st)
	{
		System.out.println(st);
	}
}

interface B
{
	//public void add();
	
	public default void sub(int x)
	{
		System.out.println(x);
		
	}
}
class Sample01 implements B
{
	public String convertToString(int i)
	{
		switch(i)
		{
		case 1:
			return "one";
		case 2:
			return "two";
		case 3:
			return "three";
		}
		return "default";
	}
	
}

public class TypesOfMethodReferene 
{
	public TypesOfMethodReferene()
	{
		System.out.println("Reference to Constructor");
	}
	public TypesOfMethodReferene(int x)
	{
		System.out.println(x);
	}
	
	public  static void sample()
	{
		System.out.println("User defined static method reference..");
	}

	public static void main(String[] args) 
	{
		//Reference to Static method 
		A obj = TypesOfMethodReferene :: sample;  //class-level
		obj.add();
		
		Consumer<String> con = A :: method;       //Interface
		con.accept("Interface level..");
		
		Function<Double , Double> f = Math :: cbrt;  //Using other pre-defined static class
		System.out.println(f.apply(5.23));
		
		Function<Float , Integer> f1 = Math :: round;
		System.out.println(f1.apply(3.23f));
		
		//Reference to Instance Methods
		Sample01 ob = new Sample01();
		
		Function<Integer , String> fun = ob :: convertToString; //class-level 
		System.out.println(fun.apply(1));
		
		Consumer<Integer> cons = ob :: sub;                    //Interface-level
		cons.accept(30);
		
		//Arbitrary-Object Method Reference
		
		Comparator<String> com = (o1, o2) ->o1.compareToIgnoreCase(o2); //Lambda expression	
		List<String> list = List.of("one","two","three","four");
		ArrayList<String> arr = new ArrayList<>(list);
		
		Collections.sort(arr, String ::compareToIgnoreCase);     //Method Reference
		System.out.println(arr);
		
		Function<String ,Integer> func =(t) -> t.length();     //Lambda expression  
		Stream.of("one","two","three","four")                   //Using Stream   
		.map(String::length)
		.forEach(System.out::println);
		
		//Reference to Constructor
		
		Supplier<TypesOfMethodReferene> su = () -> new TypesOfMethodReferene();
		Supplier<TypesOfMethodReferene> sup = TypesOfMethodReferene:: new;
		TypesOfMethodReferene re = sup.get();
		
		Consumer<Integer> con1 = (x) -> System.out.println(x);
		Consumer<Integer> con2 = TypesOfMethodReferene :: new;
		con1.accept(23);
		con2.accept(6);
		
	}

}
