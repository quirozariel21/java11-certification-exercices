public class StringBuilderSubstring {
	public static void main(String... args) {
	    String fullPhoneNumber = "ddd-ddd-dddd";
		String mask = "xxx-xxx-";
		var res1 = new StringBuilder("xxx-xxx-") + fullPhoneNumber.substring(8);
		System.out.println("res1=" + res1);  // print xxx-xxx-dddd
	}
}