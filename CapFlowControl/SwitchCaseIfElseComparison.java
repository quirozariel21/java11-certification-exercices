public class SwitchCaseIfElseComparison {
	public static void main(String... args) {
		
		int eaten = 1;

		System.out.println("First if");
		if(eaten == 1)
			System.out.println("Print 1");
		if(eaten == 2)
			System.out.println("Print 2");
		if(eaten == 3)
			System.out.println("Print 3");					


		System.out.println("Second if-else");
		if(eaten == 1)
			System.out.println("Print 1");
		else if(eaten == 2)
			System.out.println("Print 2");
		else if(eaten == 3)
			System.out.println("Print 3");					


		System.out.println("Third switch-case");
		switch (eaten) {
			case 1: System.out.println("Print 1"); 
			case 2: System.out.println("Print 2"); 
			case 3: System.out.println("Print 3");
		}

		/**
		 * ANSWER
		 * The First if and Second if-else have the same beahvior/output, for example if eaten is 1 the output of both have is 1. However,
		 * the switch-case print 1, 2 and 3, it is because it does not have a break statement.
		 */

		
	}
}

