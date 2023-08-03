public class StringOperatorEqualsAndTrim {
	public static void main(String[] arguments) {
		var res1 = "Hello world".equals("Hello world"); // Should return true
		var res2 = "Hello world" == "Hello world"; // Should return true

		System.out.println("res1= "+ res1);
		System.out.println("res2= "+ res2);

		var res3 = "Hello world" == " Hello world ".trim(); // Should return false 
	
		System.out.println("res3= "+ res3);

		//Method intern searchs in the StringPool the word Hello world whithout blank spaces	
		var res4 = "Hello world" == " Hello world ".trim().intern(); // Should true

			

		System.out.println("res4= "+ res4);
	}
}