/**
 * Variable Hiding happens when a variable declared in the child class has the same name
 * as the variable declared in the parent class.
 * 
 * In contrast, variable shadowing happens when a variable in the inner scope has the same name as the variable
 * in the outer scope. The child class' variables tend to hide the parent class' variables  when they have the
 * same name. Variabl hiding happens even when both the variables with the same name have different data types.
 * 
 * */
public class Herencia extends Baap {
	//It is hidden
	public int h = 44;

	//This method is overriden
	public int getH() {
		System.out.println("Herencia " + h);
		return h;
	}	

	public static void main(String args[]) {
		Baap b = new Herencia();
		System.out.println(b.h + " " + b.getH());
		Herencia bb = (Herencia) b;
		System.out.println(bb.h + " " + bb.getH());

		//Print:
		// Herencia 44
		// 4 44
		// Herencia 44
		// 44 44
	}
	
}

public class Baap {
	public int h = 4;
	public int getH() {
		System.out.println("Baap " + h);
		return h;
	}	
}

