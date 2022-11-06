package week1.day1;

public class Mobil1 {
	
	String mobileBrandName = "samsung";
    char mobileLogo = 'F';
    short noOfMobilePiece = 1;
    int modelNumber = 20;
    long mobileImeiNumber = 1234567891;
    float mobilePrice = 34999.99f;
    boolean isDamaged = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobil1 samsung = new Mobil1();

		System.out.println("Mobile Brand Name: " + samsung.mobileBrandName);
		System.out.println("Mobile Logo: " + samsung.mobileLogo);
		System.out.println("Number of Pieces: " + samsung.noOfMobilePiece);
		System.out.println("Model Number: " + samsung.modelNumber);
		System.out.println("IMEI Number: " + samsung.mobileImeiNumber);
		System.out.println("Price: " + samsung.mobilePrice);
		System.out.println("Is mobile damaged? " + samsung.isDamaged);
	}

}
