package collect_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

class Employee
{
	int id;
	String name;
	String department;
	int salary;
	int age;
	
	public Employee(int id, String name, String department, int salary, int age)
	{
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + ", age="
				+ age + "]";
	}
	
}

public class Task01 {

	public static void main(String[] args)
	{
		List<Employee> input = new ArrayList<>();
		input.add(new Employee(101 , "ram" , "IT" , 65000 , 21));
		input.add(new Employee(101 , "gom" , "testing" , 85000 , 24));
		input.add(new Employee(101 , "gopal" , "developer" , 15000 , 26));
		input.add(new Employee(101 , "raja" , "manager" , 29000 , 30));
		input.add(new Employee(101 , "ram" , "IT" , 50000 , 29));
		
		List<String> l = input.stream().map((x) -> x.name).collect(Collectors.toList());
		System.out.println(l);
		
		Set<String> s = input.stream().map((z) -> z.department).collect(Collectors.toSet());
		System.out.println(s);
		
		LinkedList<Employee> l1 = input.stream().collect(Collectors.toCollection(() -> new LinkedList<Employee>()));
		System.out.println(l1);
		
		String s1 = input.stream().map((x) -> x.name).collect(Collectors.joining(","));
		System.out.println(s1);
		
		String s2 = input.stream().map((x) -> x.department).collect(Collectors.joining("|"));
		System.out.println(s2);
		
		Long l2 = input.stream().collect(Collectors.counting());
		System.out.println(l2);
		
		Long l3 = input.stream().map((x) -> x.salary).collect(Collectors.summingLong((x) -> x));
		System.out.println(l3);
		
		Double d = input.stream().map((x) -> x.age).collect(Collectors.averagingDouble((x) -> x));
		System.out.println(d);
		
		IntSummaryStatistics sum = input.stream().map((x) -> x.age).collect(Collectors.summarizingInt((x) -> x));
		System.out.println(sum.getAverage());
		
		Optional<Integer> opt1 = input.stream().map((x) -> x.salary).collect(Collectors.minBy((a,b) -> a-b));
		System.out.println(opt1);
		
		Optional<Integer>opt = input.stream().map((x) -> x.age).collect(Collectors.maxBy((a,b) -> a-b));
		System.out.println(opt);
		
		Integer i = input.stream().map((x) -> x.salary).collect(Collectors.reducing(0, (x,y)->x+y));
		System.out.println(i);
		
//		input.stream().map((x) -> x.name).collect(Collectors.reducing(0, (x)->x.length(), (x,y) -> x>=y));
//		System.out.println(d);
		
		Map<String, List<String>> l4 = input.stream()
		.collect(Collectors.groupingBy((x)->x.department, 
				Collectors.mapping((x)->x.name, Collectors.toList())));
		
		System.out.println(l4);
		
		Set<String> set = input.stream()
				.map((x)->x.department)
				.distinct()
				.collect(Collectors.toSet());
		System.out.println(set);
		
		Employee[] emp = input.stream()
				.collect(Collectors.toList())  
				.toArray((x)-> new Employee[0]);
		System.out.println(Arrays.toString(emp));
		//Another method using CollectAndThen()

	}

}
