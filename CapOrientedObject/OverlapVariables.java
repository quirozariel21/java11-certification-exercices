//We do overlaping to the instance and static variables
public class OverlapVariables {

	static String name = "Juan";

	public static void main(String args[]) {
		System.out.println(name);

		for(int i=0; i< 10; i++) {
			String name = "Jose";	//2 It is overlaping the static variable		
			System.out.println(name);
		}

		int name = 1;
		System.out.println(name); //3 It is overlaping the static variable		
	}
}