public class StringNull {
	public static void main(String... args) {
		String myStr = "good";
		char[] myCharArr = {'g', 'o', 'o', 'd'};

		String newStr = null;
		for(char ch : myCharArr) {
			newStr = newStr + ch; 
		}

		//Since newStr is null at the beginning, the first iteration of the loop assigns "nullg" to newStr.
		// Therefore, at the end of the loop, newStr is actually "nullgood"
		System.out.println("newStr=" + newStr); // print nullgood
		System.out.println((newStr == myStr) + " " + (newStr.equals(myStr))); //print false false
	}
}