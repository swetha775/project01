package functional_Style_Programing;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class PreDefined_FI_Generic 
{
	public static boolean filter(Predicate<String> obj)
	{
		return obj.test("START");
		
	}
	
	public static void forEach(Consumer<Integer> con)
	{
		con.accept(23);
	}
	
	public static void main(String[] args) 
	{
		//Imperative
		Predicate<String> obj = new Predicate<>()
				{

					@Override
					public boolean test(String t)
					{
						return t.startsWith("S");
					}
				};
				
				System.out.println(filter(obj));
				
		Consumer<Integer> con = new Consumer<>()
				{

					@Override
					public void accept(Integer t)
					{
						System.out.println(t);
						
					}
				};
				forEach(con);	
	}

}
