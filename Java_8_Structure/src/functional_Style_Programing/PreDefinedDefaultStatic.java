package functional_Style_Programing;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class PreDefinedDefaultStatic
{

	public static void main(String[] args)
	{
		Predicate<Integer> p1 = (x) -> x < 5 ;
		Predicate<Integer> p2 = (x) -> x <= 1;
		
		//Default Methods
		Predicate<Integer> res = p1.and(p2);
		System.out.println(res.test(4));
		
		Predicate<Integer> res1 = p1.or(p2);
		System.out.println(res1.test(4));
		
		Predicate<Integer> res2 = p2.negate();
		System.out.println(res2.test(4));
		
		//Static method
		Predicate<Integer> res3 = Predicate.isEqual(34);
		System.out.println(res3.test(34));
		
		Function<String , String> f1 = (x) -> x + "swe,";
		Function<String , String> f2 = (x) -> x + "sri";
		
		//Default Methods
		Function<String , String> res4 = f1.andThen(f2);
		System.out.println(res4.apply("Helo "));
		
		Function<String , String> res5 = f1.compose(f2);
		System.out.println(res5.apply("Hii.."));
		
		//Static method
		Function<String , String> f = Function.identity();
		System.out.println(f.apply("hey!"));
		
		Consumer<String> c1 = (x) -> System.out.println(x + "1");
		Consumer<String> c2 = (x) -> System.out.println(x + "2");
		
		Consumer<String> r = c1.andThen(c2);
		r.accept("jii ");
		
		//Supplier don't have default and static method
		
		UnaryOperator<String> u1 = (x) -> x + "ui";
		UnaryOperator<String> u2 = (x) -> x + "yh";
		
		Function<String , String> re = u1.andThen(u2);
		System.out.println(re.apply("dey"));
		
		Function<String , String> re1 = u1.compose(u2);
		System.out.println(re1.apply("dey"));
		
		Comparator<Integer> com = new Comparator<>()
				{

					@Override
					public int compare(Integer o1, Integer o2)
					{
						return o1 - o2;
					}
			
				};
		BinaryOperator<Integer> b1 = BinaryOperator.maxBy(com);
		int max = b1.apply(12, 4);
		System.out.println(max);
		
		BinaryOperator<Integer> b2 = BinaryOperator.minBy(com);
		int min = b2.apply(21, 6);
		System.out.println(min);
		
		BiPredicate<String , Integer> bi = (x , y) -> x.length() == y;
		BiPredicate<String , Integer> bi1 = (x, y) -> x.length() !=y;
		
		BiPredicate<String , Integer> ress = bi.and(bi1);
		System.out.println(ress.test("Hello", 5));

		BiPredicate<String , Integer> ress1 = bi.or(bi1);
		System.out.println(ress1.test("Hello", 5));	
		
		BiPredicate<String , Integer> ress2 = bi.negate();
		System.out.println(ress2.test("Hello", 5));
		
		BiConsumer<String , Integer> co = (x , y) -> System.out.println(x+"1"+y);
		BiConsumer<String , Integer> co1 = (x , y) -> System.out.println(x+"2"+y);
		
		BiConsumer<String , Integer> ress3 = co.andThen(co1);
		ress3.accept("start", 0);
		
		BiFunction<String , String , String> bif = (x,y) -> x+y;
		Function<String , String > bif1 = (x) -> x+ "srii";
	
		BiFunction<String , String , String> ress4 = bif.andThen(bif1);
		System.out.println(ress4.apply("Hii ", "nga "));
				
	}

}
