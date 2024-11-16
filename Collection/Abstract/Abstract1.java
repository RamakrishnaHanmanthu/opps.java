package Abstract;

public abstract class Abstract1 {

	private String food;
	private String range;
	

	public Abstract1( String food, String range) {
		super();
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

	public String eat( String food, String range) {
		
		return range+ " " + food;

	}
	
	public abstract String food();
	
	public abstract String charge();
	
	
	
	
	
}
