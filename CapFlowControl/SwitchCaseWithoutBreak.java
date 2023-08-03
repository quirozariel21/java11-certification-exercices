public class SwitchCaseWithoutBreak {
	public static void main(String... args) {
		var flavors = 120;
		int eaten = 0;
		switch (flavors) {
			case 120: eaten++; 
			case 121: eaten+=2; 
			case 122: eaten++; 
			default: eaten--;
		}
		System.out.println("eaten = " + eaten); //print: 3 // How there are no break statements the code runs from above to below
	}
}

