package functional_Style_Programing;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class PreDefinedUsingLambda 
{
	//Declarative 
	public static boolean filter(Predicate<Integer> obj)
	{
		return obj.test(5);
	}
	
	public static void forEach (Consumer<String> obj)
	{
		obj.accept("Using Lambda...");
	}
	
	public static String generate(Supplier<String> obj)
	{
		return obj.get();
	}
	
	public static boolean map(Function<String , Boolean > obj)
	{
		return obj.apply("Hello");
	}
	
	public static String add(UnaryOperator<String> obj)
	{
		return obj.apply("Hii ");
	}
	
	public static boolean sample(BiPredicate<String , Integer> obj)
	{
		return obj.test("Shine", 7);
	}
	
	public static String sample2(BiFunction<String , String , String> obj)
	{
		return obj.apply("The star is ", "Shine..");
	}
	
	public static void sample3(BiConsumer<String , Integer> obj)
	{
		obj.accept("The value :", 67);
	}
	
	public static String sample4(BinaryOperator<String> obj)
	{
		return obj.apply("Sri", "nga");
	}

	public static void main(String[] args) 
	{
		//Single parameter
		System.out.println(filter((t) -> t%2 ==0 ));
		
		forEach((t) -> System.out.println(t));
		
		System.out.println(generate(() -> "The Star is Blink"));
		
		System.out.println(map((t) -> t.contains("l")));
		
		System.out.println(add((t) -> t.concat("Swetha")));
		
		//Double Parameter
		System.out.println(sample((t , u) -> t.length() == u));
		
		System.out.println(sample2((t , u) -> t+""+u));
		
		sample3((t ,u) -> System.out.println(t+u));
		
		System.out.println(sample4((t ,u) -> t+" "+u));

	}

}
