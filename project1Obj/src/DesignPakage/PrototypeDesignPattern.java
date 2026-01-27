package DesignPakage;

class Employe implements Cloneable
{
	private int id;
	private String name;
	private String password;
	
	public Employe(int id, String name, String password) 
	{
		this.id = id;
		this.name = name;
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", password=" + password + "]";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException 
	{
		return super.clone();
	}
	
	
}
public class PrototypeDesignPattern 
{

	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Employe obj = new Employe(101 , "swetha" , "321");
		System.out.println(obj);
		
		Employe obj1 = (Employe) obj.clone();
		obj1.setPassword("567");
		System.out.println(obj1);
		

	}

}
