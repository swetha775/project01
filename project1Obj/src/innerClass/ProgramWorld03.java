package innerClass;

import java.util.Scanner;

public class ProgramWorld03 
{
	int accNo;
	String holderName;
	int balance;
	int amount;
	
	Scanner scan = new Scanner(System.in);
	
	void Details()
	{
		System.out.println("Account Number");
		accNo = scan.nextInt();
		
		System.out.println("holderName");
		holderName = scan.next();
		
		System.out.println("balance");
		balance = scan.nextInt();
		
	
		
	}
	
	void deposit()
	{
		System.out.println("amounnt of deposit");
		amount = scan.nextInt();
		
		balance += amount;
		System.out.println("After Deposit: "+balance);
	}
	
	void withdraw()
	{
		System.out.println("amount of withdraw");
		amount = scan.nextInt();
		
		balance -= amount;
		System.out.println("After Withdraw: "+balance);

	}

	public static void main(String[] args) 
	{
		ProgramWorld03 person = new ProgramWorld03();
		person.Details();
		person.deposit();
		person.withdraw();

	}

}
