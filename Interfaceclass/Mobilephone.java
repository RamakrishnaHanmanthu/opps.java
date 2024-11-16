package Interfaceclass;

public class Mobilephone implements MobileWorld {

	public int camera;

	public Mobilephone(int camera) {
		super();
		this.camera = camera;

	}

	@Override
	public double Mobileprice() {

		double price = 0;
		if (camera == 3) {
			price = 30000;
		} else if (camera == 2) {
			price = 20000;
		} else if (camera == 1) {
			price = 10000;
		}
		return price;
	}

	@Override
	public double gst() {

		return Mobileprice() * 0.18;
	}

}
