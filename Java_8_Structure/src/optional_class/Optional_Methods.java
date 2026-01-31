package optional_class;

import java.util.Optional;
import java.util.function.Consumer;

public class Optional_Methods 
{
	public static void main(String[] args) 
	{
		//Static Methods in Optional -> (Can't create Constructor - its private)
		Optional<String> op = Optional.empty();
		System.out.println(op);
		
		Optional<String> op1 = Optional.of("heloo");
		System.out.println(op1.get());
		
		Optional<String> opt = Optional.ofNullable("Hello");
		
		//Non-static Methods in Optional
		if(opt.isPresent())
		{
			System.out.println(opt.get());
		}else {
			System.out.println("No data found!");
		}
		System.out.println(opt.isPresent()); 
		
		System.out.println(opt.isEmpty());
		
		//Conditional Execution
		opt.ifPresent((t) -> System.out.println(t.toUpperCase()));
		
		//Retrieve the value
		System.out.println(opt.get());
		
		String st = opt.orElse("default");
		System.out.println(st);
		
		String st1 = opt.orElseGet(() -> "noo values..");
		System.out.println(st1);
		
		try {
		String st2 = opt.orElseThrow(() -> {throw new RuntimeException("Not found any values..");});
		System.out.println(st2);
		}
		catch(RuntimeException e)
		{
			System.out.println(e.getMessage());
		}
		
		//Transformation
		opt.map((t) -> t.toUpperCase()).map((t) -> t + " All").ifPresent((x) -> System.out.println(x));
		
		try {
		String str = opt.filter((t) -> t.contains("H")).orElseThrow(() -> {throw new RuntimeException("Not found any values..");});
		System.out.println(str);
		
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
