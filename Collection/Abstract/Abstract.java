package Abstract;

public class Abstract extends Abstract1 {

	private String Animal;
	private String Bread;
	
	public Abstract(String Animal, String Bread) {
		// TODO Auto-generated constructor stub
		super(Animal, Bread);
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

	public String food() {
		return null;
	}

	public String charge() {
		// TODO Auto-generated method stub
		return null;
	}

	

	
}
	
