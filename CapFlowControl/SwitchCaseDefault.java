public class SwitchCaseDefault {
	public static void main(String... args) {
		byte foo = 120;
		switch (foo) {
			default: System.out.println("ejavaguru"); break;
			case 2: System.out.println("e"); break;
			case 120: System.out.println("ejava"); 
			case 121: System.out.println("enum");
			case 127: System.out.println("guru"); break;
		}
	}
}

//print:
// ejava
// enum
// guru