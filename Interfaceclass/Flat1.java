package Interfaceclass;

public class Flat1 implements Apartement {

	public int totalnoofSqfts;
	public int sqftsperFlat;
	public int numberofRoomsPerFlat;
	public int numberofWindowsPerFlat;
	public int costperFlat;
	public int noofFloors;

	public Flat1(int totalnoofSqfts, int sqftsperFlat, int numberofRoomsPerFlat, int numberofWindowsPerFlat, int costperFlat, int noofFloors ){
		super();
		this.totalnoofSqfts = totalnoofSqfts;
		this.sqftsperFlat = sqftsperFlat;
		this.numberofRoomsPerFlat = numberofRoomsPerFlat;
		this.numberofWindowsPerFlat = numberofWindowsPerFlat;
		this.costperFlat=costperFlat;
		this.noofFloors=noofFloors;
	}

	@Override
	public int numberofFlats() {
     costperFlat= (totalnoofSqfts/sqftsperFlat)*costperFlat;
     noofFloors=(totalnoofSqfts/sqftsperFlat)*noofFloors;
		return totalnoofSqfts/sqftsperFlat;
	}

	@Override
	public int numberofRooms() {

		return numberofRoomsPerFlat*(totalnoofSqfts/sqftsperFlat);
	}

	@Override
	public int numberofWindows() {

		return (totalnoofSqfts/sqftsperFlat)*numberofWindowsPerFlat;
	}

}
