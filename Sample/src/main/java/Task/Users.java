package Task;

public class Users 
{
	private String username;
	private String age;
	private String gender;
	private String email;
	
	public Users(String username, String age, String gender, String email) {
		super();
		this.username = username;
		this.age = age;
		this.gender = gender;
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public String getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public String getEmail() {
		return email;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
