public class StringIntern {
	/**
	 * The method intern() creates an exact copy of a String object in the heap memory and stores it in the String
	 * constant pool. Note thta, if another String with the same contents exists in the String constant pool, then
	 * a new object won't be created and the new reference will point to the other String.
	 * 
	 */
	public static void main(String... args) {
		String s1 = new String("abc"); //Goes to the Heap Memory
		String s2 = "abc"; // goes to String Pool
		String s3 = "abc"; // goes to String Pool

		System.out.println("s1==s2? "+(s1==s2)); //print false
		System.out.println("s2==s3? "+(s1==s2)); //print true

		s1 = s2.intern(); // this should return the String with same value, BUT from string value	

		System.out.println("s1==s2? "+(s1==s2)); //Should print true now

	}
}