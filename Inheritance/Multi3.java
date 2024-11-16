package Inheritance;

public class Multi3 extends Multi2 {

	private String veg;

	public Multi3(String Animal, String Bread, String food, String range, String veg) {
		super(Animal, Bread, food, range);
		this.setVeg(veg);

	}

	public String getVeg() {
		return veg;
	}

	public void setVeg(String veg) {
		this.veg = veg;
	}
	

	public String kill(String Animal, String Bread, String food, String range, String veg) {
		eat(Animal, Bread, food, range);
		return eat(Animal, Bread, food, range) +" " + veg;
	
	
    }
}