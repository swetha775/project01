package Practice_task;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

class Employee
{
	private String empName;
	private int age;
	private String department;
	private int salary;
	private List<String> skill;
	private LocalDate joiningDate;
	private LocalDate releivigDate;
	
	
	public Employee(String empName, int age, String department, int salary, List<String> skill, LocalDate joiningDate,
			LocalDate releivigDate) {
		super();
		this.empName = empName;
		this.age = age;
		this.department = department;
		this.salary = salary;
		this.skill = skill;
		this.joiningDate = joiningDate;
		this.releivigDate = releivigDate;
	}
	
	
	public String getEmpName() {
		return empName;
	}


	public int getAge() {
		return age;
	}


	public String getDepartment() {
		return department;
	}


	public int getSalary() {
		return salary;
	}


	public List<String> getSkill() {
		return skill;
	}


	public LocalDate getJoiningDate() {
		return joiningDate;
	}


	public LocalDate getReleivigDate() {
		return releivigDate;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public void setSkill(List<String> skill) {
		this.skill = skill;
	}


	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}


	public void setReleivigDate(LocalDate releivigDate) {
		this.releivigDate = releivigDate;
	}


	
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", age=" + age + ", department=" + department + ", salary=" + salary
				+ ", skill=" + skill + ", joiningDate=" + joiningDate + ", releivigDate=" + releivigDate + "]";
	}


	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(this.empName , this.age , this.salary , this.joiningDate , this.releivigDate, this.skill);
	}
	@Override
	public boolean equals(Object obj) 
	{
		
		if(obj instanceof Employee)
		{
			Employee emp = (Employee) obj;
			if(this.hashCode() == obj.hashCode())
			{
				return true;
			}
		}
		return false;
	}
	
	
	
}
public class EvaluateTask 
{
	public static void main(String[] args) 
	{
		List<Employee> employees = Arrays.asList(

	            new Employee(
	                "Amit Sharma",
	                28,
	                "It",
	                50000,
	                Arrays.asList("Java", "Spring", "SQL"),
	                LocalDate.of(2021, 1, 10),
	                LocalDate.of(2024, 1, 10)
	            ),

	            new Employee(
	                "Priya Verma",
	                32,
	                "Developer",
	                65000,
	                Arrays.asList("Python", "Django", "REST"),
	                LocalDate.of(2020, 3, 15),
	                LocalDate.of(2023, 6, 30)
	            ),
	            new Employee(
	                    "Rahul Singh",
	                    26,
	                    "Testing",
	                    42000,
	                    Arrays.asList("HTML", "CSS", "JavaScript"),
	                    LocalDate.of(2022, 7, 1),
	                    LocalDate.of(2025, 7, 1)
	                ),

	             new Employee(
	                    "Sneha Patel",
	                    35,
	                    "IT",
	                    80000,
	                    Arrays.asList("Java", "Microservices", "AWS"),
	                    LocalDate.of(2018, 11, 20),
	                    LocalDate.of(2024, 11, 20)
	                ),
	             new Employee(
	                        "Vikram Rao",
	                        40,
	                        "Tester",
	                        95000,
	                        Arrays.asList("Project Management", "Agile", "Scrum"),
	                        LocalDate.of(2016, 5, 5),
	                        LocalDate.of(2023, 5, 5)
	                    ),

	             new Employee(
	                        "Neha Kapoor",
	                        29,
	                        "Developer",
	                        55000,
	                        Arrays.asList("React", "JavaScript", "Node.js"),
	                        LocalDate.of(2021, 9, 12),
	                        LocalDate.of(2024, 9, 12)
	                    ),
	             new Employee(
	                            "Arjun Mehta",
	                            34,
	                            "Manager",
	                            72000,
	                            Arrays.asList("C++", "Data Structures", "Algorithms"),
	                            LocalDate.of(2019, 2, 18),
	                            LocalDate.of(2023, 12, 31)
	                        ),

	             new Employee(
	                            "Kavya Nair",
	                            27,
	                            "HR",
	                            48000,
	                            Arrays.asList("Testing", "Selenium", "JUnit"),
	                            LocalDate.of(2022, 4, 25),
	                            LocalDate.of(2025, 4, 25)
	                        ),
	             new Employee(
	                                "Rohit Kumar",
	                                31,
	                                "Manager",
	                                60000,
	                                Arrays.asList("DevOps", "Docker", "Kubernetes"),
	                                LocalDate.of(2020, 8, 10),
	                                LocalDate.of(2024, 8, 10)
	                            ),

	              new Employee(
	            		  "Rohit Kumar",
                          31,
                          "Manager",
                          60000,
                          Arrays.asList("DevOps", "Docker", "Kubernetes"),
                          LocalDate.of(2020, 8, 10),
                          LocalDate.of(2024, 8, 10)
	                            )
	                        );
		
		//Object wise remove duplicate 

		Set<Employee> list = employees.stream().collect(Collectors.toSet());
		System.out.println(list); // first way
		List<Employee> list1 = employees.stream().distinct().toList();
		System.out.println(list1); //second way
		
		//based on length to get name -> o/p: 5=[hello]
		Map<Integer,List<String>>map1 = employees.stream().collect(Collectors.groupingBy((x)->x.getEmpName().length(),
				Collectors.mapping((x)->x.getEmpName(),
						Collectors.toList())
				));
		System.out.println(map1);
		
		//>40000 salary to get name -> o/p: [..........]
		Map<Boolean , List<String>> map2 = employees.stream().collect(Collectors.partitioningBy((x)->x.getSalary()>40000 ,
				Collectors.mapping((x->x.getEmpName()), Collectors.toList())
				));
		System.out.println(map2);
	
		//List of skills to convert single list -> toUppercase
		List<List<String>> list2 = employees.stream()
				.collect(Collectors.mapping((x)->x.getSkill(), Collectors.toList()));
		List<String> s = list2.stream().flatMap((x)->x.stream())
				.map((x)->x.toUpperCase()).toList();
		
		System.out.println(s);
		
		//Another way
		List<List<String>> list3 =employees.stream()
		.collect(Collectors.mapping((x)->x.getSkill(), Collectors.toList()));
		List<String> s1 = list3.stream().collect(Collectors.flatMapping((x)->x.stream(), 
				Collectors.toList()));
		System.out.println(s1);
		
		

	}

}
