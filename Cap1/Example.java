//import java.lang.*;

public class Example {
	public static void main(String args[]) {
		
		//operatorLogic();
		//operators();
		//question4();
		question5();
	}


	public static void operatorLogic() {
		System.out.println(true ^ true); // print 	false
		System.out.println(false ^ false); // print false
		System.out.println(true ^ false); // print  true
		System.out.println(false ^ true); // print  true
	}

	public static void operators() {
		int pig = (short)4;
		pig = pig++;
		long goat = (int) 2;
		goat -= 1.0;
		System.out.println(pig + " - " + goat); // print 4 - 1
	}

	public static void question4() {
		var b = "12";
		b += "3";
		//b.reverse(); 				//There is no  reverse method on the String class
		System.out.println("b=" + b.toString());
	}

	public static void question5() {
		var line = new StringBuilder("-");
		var anotherLine = line.append("-");
		System.out.print(line == anotherLine); //true
		System.out.print(" ");
		System.out.println(line.length());//2
		System.out.println("line = " + line);
		System.out.println("anotherLine = " + anotherLine);
	}

	public static void question7() {
		var line = new String("-"); 			// a String is immutable, 
		var anotherLine = line.concat("-");
		System.out.print(line == anotherLine); 	//false
		System.out.print(" ");
		System.out.print(line.length());		//1
	}
}