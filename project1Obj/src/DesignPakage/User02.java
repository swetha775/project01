package DesignPakage;

public class User02 
{
	private int id;
	private String name;
	private String password;
	private String dept;
	
	public User02(int id, String name, String password, String dept)
	{
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.dept = dept;
	}
	
	@Override
	public String toString() 
	{
		return "User02 [id=" + id + ", name=" + name + ", password=" + password + ", dept=" + dept + ", getId()="
				+ getId() + ", getName()=" + getName() + ", getPassword()=" + getPassword() + ", getDept()=" + getDept()
				+ "]";
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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	
	

}
