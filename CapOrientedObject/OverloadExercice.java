public class OverloadExercice {

	public void method(Object o) {
		System.out.println("Object version");
	}

	//FileNotFoundException is a subClass of IOException
	public void method(java.io.FileNotFoundException s) {
		System.out.println("java.io.FileNotFoundException version");
	}

	public void method(java.io.IOException e) {
		System.out.println("java.io.IOException version");
	}

	public static void main(String args[]) {
		OverloadExercice obj = new OverloadExercice();
		obj.method(null); //Print java.io.FileNotFoundException version
	}
}