package Inheritance;

public class Multi2 extends Multi1 {
	private String food;
	private String range;

	public Multi2(String Animal, String Bread, String food, String range) {
		super(Animal, Bread);
		this.food=food;
		this.range=range;

	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public String getRange() {
		return range;
	}

	public void setReange(String range) {
		this.range = range;
	}

	public String eat(String Animal, String Bread, String food, String range) {
		super.getAnimal();
		super.getBread();
		return  super.getAnimal()+" "+ super.getBread()+ " "+range+ " " + food;

	}

}
