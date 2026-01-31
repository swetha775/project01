package Tasks;

import java.util.Scanner;

public class Accounts 
{
	private long acc_No;
	private String acc_holderName;
	private Double acc_Bal;
	private long mobile_No;
	
	public Accounts()
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter AccountNo :");
		acc_No = scan.nextLong();
		
		System.out.println("Enter Account_holderName :");
		acc_holderName = scan.next();
		scan.nextLine();
		
		System.out.println("Enter Account_Balance :");
		acc_Bal = scan.nextDouble();
		
		System.out.println("Enter MobileNo :");
		mobile_No = scan.nextLong();
		
	}
	
	public long getAcc_No() {
		return acc_No;
	}

	public String getAcc_holderName() {
		return acc_holderName;
	}

	public Double getAcc_Bal() {
		return acc_Bal;
	}

	public long getMobile_No() {
		return mobile_No;
	}

	public void setAcc_No(long acc_No) {
		this.acc_No = acc_No;
	}

	public void setAcc_holderName(String acc_holderName) {
		this.acc_holderName = acc_holderName;
	}

	public void setAcc_Bal(Double acc_Bal) {
		this.acc_Bal = acc_Bal;
	}

	public void setMobile_No(long mobile_No) {
		this.mobile_No = mobile_No;
	}

}
