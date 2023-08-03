import java.util.Arrays;

public class BinarySearch {
	
	public static void main(String... args){
		var os = new String[] {"Mac", "Linux", "Windows"};

		Arrays.sort(os);
		System.out.println(Arrays.toString(os));
		System.out.println(Arrays.binarySearch(os, "RedHat")); //print pos -3
		System.out.println(Arrays.binarySearch(os, "Mac")); //print pos 1
		System.out.println(Arrays.binarySearch(os, "Amazon")); //print pos -1 because it is the first position
	}
}