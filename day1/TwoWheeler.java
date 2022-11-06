package week1.day1;

public class TwoWheeler {
	int noOfWheels = 2;  
    short noOfMirrors = 1;  
    long chassisNumber = 123456789l;
    boolean isPunctured = false;
    String bikeName = "Pulsar";
    double runningKM = 8000.52;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoWheeler Bajaj = new TwoWheeler();

		System.out.println("Number of Wheels: " + Bajaj.noOfWheels);
		System.out.println("Number of Mirrors: " + Bajaj.noOfMirrors);
		System.out.println("Chassis Number: " + Bajaj.chassisNumber);
		System.out.println("Is the bike punctured: " + Bajaj.isPunctured);
		System.out.println("Bike Name: " + Bajaj.bikeName);
		System.out.println("Running Kilometers: " + Bajaj.runningKM);
	}

}
