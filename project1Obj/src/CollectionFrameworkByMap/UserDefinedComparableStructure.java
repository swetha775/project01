package CollectionFrameworkByMap;

import java.util.PriorityQueue;

class Employee implements Comparable<Employee>
{
	private int id;
	private String name;
	private int salary;
	
	public Employee(int id, String name, int salary) 
	{
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee o) 
	{
		if(this.salary < o.salary)
		{
			return -1;
		}
		else if(this.salary > o.salary)
		{
			return 1;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}

public class UserDefinedComparableStructure
{
	//Natural Order Using User-Defined Class
	
	public static void main(String[] args) 
	{
		PriorityQueue<Employee> pq = new PriorityQueue<Employee>();
		
		pq.add(new Employee(11 , "swe" , 5000));     
		pq.add(new Employee(12 , "sri" , 500));
		pq.add(new Employee(13 , "nila" , 300));
		pq.add(new Employee(14 , "gops" , 10));
		
		System.out.println(pq);
		System.out.println(pq.poll());

	}

}
