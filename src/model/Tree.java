package model;

public class Tree {
	private int appleNumber;
	private int flowerNumber;

	public Tree() {
		appleNumber = 1;
		flowerNumber = 1;
	}

	public int shake() {
		int number = (int) (Math.random() * appleNumber);
		appleNumber -= number;
		System.out.println("appleNumber: " + appleNumber);
		return number;
	}

	public int grow() {
		int number = (int) (Math.random() * flowerNumber);
		appleNumber += number;
		flowerNumber -= number;
		System.out.println("appleNumber: " + appleNumber);
		System.out.println("flowerNumber: " + flowerNumber);
		return number;
	}

	public int blossom() {
		int number = (int) (Math.random() * 10);
		flowerNumber += number;
		System.out.println("flowerNumber: " + flowerNumber);
		return number;
	}

	public int getAppleNumber() {
		return appleNumber;
	}

	public void setAppleNumber(int appleNumber) {
		this.appleNumber = appleNumber;
	}

}
