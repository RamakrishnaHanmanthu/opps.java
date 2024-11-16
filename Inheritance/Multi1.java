package Inheritance;

public class Multi1 {

	private String Animal;
	private String Bread;
	
	public Multi1(String Animal, String Bread) {
		// TODO Auto-generated constructor stub
		super();
		this.Animal=Animal;
		this.Bread=Bread;
		}

	public String getAnimal() {
		return Animal;
	}

	public void setAnimal(String animal) {
		Animal = animal;
	}

	public String getBread() {
		return Bread;
	}

	public void setBread(String bread) {
		Bread = bread;
	}
	public String hunt(String Animal, String Bread) {
		return Animal+" "+Bread ;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
