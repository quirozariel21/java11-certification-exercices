public class Constructor {
	private int myValue = 0; //member field

	public void showOne(int myValue) {
		// If you declare a local variable with the same
		// name as the instance field name, the local
		// variable "shadows" the member field
		myValue = myValue;
	}

	public void showTwo(int myValue) {
		this.myValue = myValue; 
	}

	public static void main(String... args) {
		var ct = new Constructor();
		ct.showTwo(200);
		System.out.println("showTwo: " + ct.myValue); // It won't fail because despite to the variable myValue is private, it is called from de static method into the same class 
		ct.showOne(100);
		System.out.println("showOne: " + ct.myValue);

		//Print 200 followed by 200

	}
}