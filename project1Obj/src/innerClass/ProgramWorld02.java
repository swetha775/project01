package innerClass;

import java.util.Scanner;

public class ProgramWorld02
{
	String empName;
	int empId;
	int basicSalary;
	int bonus;
	
	Scanner scan = new Scanner(System.in);
	
	public void calculateTotalSalary()
	{
		int res = basicSalary + bonus;
		System.out.println("Total Salary: "+(double)res);
	}
	
	public void empDetails()
	{
		System.out.println("Enter empName:");
		 empName = scan.next();
		
		System.out.println("Enter empId:");
		 empId = scan.nextInt();
		
		System.out.println("Enter basicSalary:");
		 basicSalary = scan.nextInt();
		
		System.out.println("Enter bonus:");
		 bonus = scan.nextInt();
	}

	public static void main(String[] args) 
	{
		ProgramWorld02 emp1[] = new ProgramWorld02[3];
		
		for(int i=0;i<emp1.length; i++)
		{
			emp1[i] = new  ProgramWorld02();
			
			emp1[i].empDetails();
			emp1[i].calculateTotalSalary();
		}

	}
	
	

}
