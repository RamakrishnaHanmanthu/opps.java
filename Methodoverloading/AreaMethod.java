package Methodoverloading; //method overloading

public class AreaMethod {
	// square
	public static double findArea(double sides) {
		return sides * sides;
	}

	// rectangle
	public static double findArea(double length, double breadth) {
		return length * breadth;
	}

	// cube
	public static double findArea(float sides) {

		return 6 * (sides * sides);

	}

	// triangle
	public static double findArea(int breadth, int height) {
		return 0.5 * breadth * height;

	}

	// circle
	public static double findArea(long radius) {
		return Math.PI * (radius * radius);
	}

	// hexagon
	public static double findArea(int sides) {
		return (3 * Math.sqrt(3) * sides * sides) / 2;

	}

	// cuboid
	public static double findArea(int length,int width,int height) {
		return 2*(length*width+width*height+height*length);
		
	}
	//parallagorm
	public static double findArea(float base, float height) {
		return base*height;

	}

	// square
	public static double findPerimeter(double sides) {
		return 4*sides;
	}

	// rectangle
	public static double findPerimeter(double length, double breadth) {
		return (length + breadth)*2;
	}

	// cube
	public static double findPerimeter(float sides) {

		return 12*sides;

	}

	// triangle
	public static double findPerimeter(short sides) {
		return sides+sides+sides;

	}

	// circle
	public static double findPerimeter(long radius) {
		return 2*Math.PI*radius;
	}

	// hexagon
	public static double findPerimeter(int sides) {
		return 6*sides;

	}

	// cuboid
	public static double findPerimeter(int length,int width,int height) {
		return 4*(length+width+height);
		
	}
	//parallagorm
	public static double findPerimeterfindArea(float base, float height) {
		return 2*(base+height);

	}
	public static void main(String[] args) {
		short sides =10;
		// TODO Auto-generated method stub
		System.out.println("the area of circlr : " + findArea(2L) +"the perimeter of circle : " +findPerimeter(2L));
		System.out.println("the area of square : " + findArea(2.2)+ "the area of square : " + findPerimeter(2.2) );
		System.out.println("the area of triangle : " + findArea(2.2,2.2)+ "the area of triangle: " + findPerimeter(sides));
		System.out.println("the area of rectangle : " + findArea(2, 2)+"the area of rectangle : " + findPerimeter(2.2, 2.2));
		System.out.println("the area of parallagorm : " + findArea(2f, 2f)+"the area of parallagorm : " + findPerimeter(2f, 2f));
		System.out.println("the area of cube : " + findArea(2f) +"the perimeter of cube : " +findPerimeter(2f));
		
	}

}

