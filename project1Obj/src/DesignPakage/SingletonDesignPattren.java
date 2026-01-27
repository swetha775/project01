package DesignPakage;

public class SingletonDesignPattren {

	public static void main(String[] args) 
	{
		User01 user1 = new User01(101 , "swetha" , "pass345");
		DBconnection res = DBconnection.getInstance();
		res.connect(user1);
		
		User02 user2 = new User02(102 , "sriga" , "pass321" , "dev");
		res.connect(user2);

		User01 user3 = new User01(103 , "vennila" , "pass876");
		res.connect(user3);
		
		


	}

}
