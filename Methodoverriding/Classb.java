package Methodoverriding;;

public class Classb extends Class{
 
	private String gender;

	public Classb(String firstname ,String lastname,  int age , String gender) {
		super(firstname,lastname,age);
		this.gender=gender;
		
	}
	public String calClass() {
		return " " +super.getLastname() + " " + super.getFirstname()+ " " + super.getAge() + " "  + gender;

}
}