package Task;

public class Employee
{
	private int emp_id;
	private String emp_name;
	private String emp_dept;
	private Double salary;
	
	
	
	public Employee(int emp_id, String emp_name, String emp_dept, Double salary) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_dept = emp_dept;
		this.salary = salary;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public String getEmp_dept() {
		return emp_dept;
	}
	public Double getSalary() {
		return salary;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public void setEmp_dept(String emp_dept) {
		this.emp_dept = emp_dept;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_dept=" + emp_dept + ", salary=" + salary
				+ "]";
	}
	
	
	
	

}
