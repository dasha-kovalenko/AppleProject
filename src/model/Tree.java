package model;

public class Tree {
	private int appleNumber;
	
	public Tree (){
		appleNumber = 1;
	}

	public int shake() {
		int number = (int) (Math.random() * appleNumber);
		appleNumber -= number;
		System.out.println("appleNumber: " + appleNumber);
		return number;
	}

	public int grow() {
		int number = (int) (Math.random() * 10);
		appleNumber += number;
		System.out.println("appleNumber: " + appleNumber);
		return number;
	}

	public int getAppleNumber() {
		return appleNumber;
	}

	public void setAppleNumber(int appleNumber) {
		this.appleNumber = appleNumber;
	}

}
