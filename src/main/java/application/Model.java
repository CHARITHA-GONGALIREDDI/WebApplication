package application;

public class Model {
	private String Id;
	private String Name;
	private String Email;
	private String Age;
	private String DateOfBirth;
	public Model(String name,String email,String age,String dob) {
		this.Name=name;
		this.Email=email;
		this.Age=age;
		this.DateOfBirth=dob;
	}
	public Model(String Id,String name,String email,String age, String dob) {
		this.Id=Id;
		this.Name=name;
		this.Email=email;
		this.Age=age;
		this.DateOfBirth=dob;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getAge() {
		return Age;
	}
	public void setAge(String age) {
		Age = age;
	}
	public String getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public String toString1() {
		return Name;
	}
	public String toString() {
		return Email;
	}
	public String toString2() {
		return Age;
	}
	public String toString3() {
		return DateOfBirth;
	}
	public String toString4() {
		return Id;
	}
}
