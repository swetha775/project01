package collect_stream;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee01
{
	private Integer id;
	private String empName;
	private String department;
	private LocalDate joiningDate;
	private LocalDate relievingDate;
	
	public Employee01(Integer id, String empName, String department, LocalDate joiningDate, LocalDate relievingDate) {
		super();
		this.id = id;
		this.empName = empName;
		this.department = department;
		this.joiningDate = joiningDate;
		this.relievingDate = relievingDate;
	}
	
	public Employee01() {
		super();
	}

	public Integer getId() {
		return id;
	}
	public String getEmpName() {
		return empName;
	}
	public String getDepartment() {
		return department;
	}
	public LocalDate getJoiningDate() {
		return joiningDate;
	}
	public LocalDate getRelievingDate() {
		return relievingDate;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}
	public void setRelievingDate(LocalDate relievingDate) {
		this.relievingDate = relievingDate;
	}
	
	@Override
	public String toString() {
		return "Employee01 [id=" + id + ", empName=" + empName + ", department=" + department + ", joiningDate="
				+ joiningDate + ", relievingDate=" + relievingDate + "]";
	}

}

public class Evaluation_Problem 
{
	public static void main(String[] args)
	{
		List<Employee01> employees = new ArrayList<>();

        employees.add(new Employee01(101, "Arun", "IT",
                LocalDate.of(2020, 1, 10), LocalDate.of(2023, 3, 31)));

        employees.add(new Employee01(102, "Priya", "HR",
                LocalDate.of(2019, 5, 20), LocalDate.of(2022, 12, 15)));

        employees.add(new Employee01(103, "Karthik", "Finance",
                LocalDate.of(2021, 7, 1), LocalDate.of(2024, 6, 30)));

        employees.add(new Employee01(104, "Divya", "IT",
                LocalDate.of(2018, 3, 12), LocalDate.of(2021, 8, 25)));

        employees.add(new Employee01(105, "Ramesh", "Admin",
                LocalDate.of(2017, 11, 5), LocalDate.of(2020, 10, 10)));

        employees.add(new Employee01(106, "Sneha", "HR",
                LocalDate.of(2022, 2, 14), LocalDate.of(2024, 1, 31)));
        employees.add(new Employee01(107, "Vijay", "Finance",
                LocalDate.of(2016, 6, 18), LocalDate.of(2019, 9, 30)));

        employees.add(new Employee01(108, "Anitha", "IT",
                LocalDate.of(2023, 1, 9), LocalDate.of(2025, 12, 31)));

        employees.add(new Employee01(109, "Suresh", "Sales",
                LocalDate.of(2020, 4, 22), LocalDate.of(2023, 11, 30)));

        employees.add(new Employee01(110, "Meena", "Marketing",
                LocalDate.of(2019, 8, 1), LocalDate.of(2022, 7, 15)));
        
        Long l = ChronoUnit.YEARS.between(employees.get(0).getJoiningDate(), 
        		employees.get(0).getRelievingDate());
        System.out.println(l);
        
        //1.o/p: name = 3 -> year gap
        Map<String , Long> map1 = employees.stream()
        		.collect(Collectors.toMap((x)->x.getEmpName(),
        		(y)->ChronoUnit.YEARS.between(y.getJoiningDate(), y.getRelievingDate())));
        System.out.println(map1);
        
        //2.o/p:2={Karthik,Ramesh,Anitha,Meena} -> based experience to getName
        Map<Long , String> map2 = employees.stream()
        		.collect(Collectors.groupingBy((x)->ChronoUnit.YEARS.between(x.getJoiningDate(), x.getRelievingDate()),
        		Collectors.mapping((x)->x.getEmpName(),
        				Collectors.joining(",", "{", "}"))
        		));
        System.out.println(map2);
        
        Comparator<Employee01> com = new Comparator<>()
        		{
					@Override
					public int compare(Employee01 o1, Employee01 o2) {
						Long frist = ChronoUnit.YEARS.between(o1.getJoiningDate(), o1.getRelievingDate());
						Long second = ChronoUnit.YEARS.between(o2.getJoiningDate(), o2.getRelievingDate());
						return (int) (frist - second);
					}
	
        		};
        
        //3.o/p: IT= name -> Every department to get senior
        Map<String , String> map3 = employees.stream()
        .collect(Collectors.groupingBy((x)->x.getDepartment(),
        		Collectors.collectingAndThen(Collectors.maxBy(com), 
        				(x)->x.get().getEmpName())));
        System.out.println(map3);
        
        //Find Longest name
        String s = employees.stream().map((x)->x.getEmpName())
        		.collect(Collectors.reducing((x , y)->x.length()>y.length()? x:y))
        		.get();
        System.out.println(s);
        
        //4.{4=[Arun,Bala,Hari] -> based on length to getName 
        
        Map<Integer , List<String>> map5 = employees.stream()
        		.collect(Collectors.groupingBy((x)->x.getEmpName().length(),
        				Collectors.mapping((x)->x.getEmpName(), 
        						Collectors.toList())));
        System.out.println(map5);

        //5.o/p:one =2 -> count the string
        List<String> list = List.of("one","one","two","two","three","three","four");
        Map<String , Long> map4 = list.stream()
        		.collect(Collectors.groupingBy((x)-> x,
        		Collectors.counting()));
        System.out.println(map4);
        
        
   
	}

}
