public class BreakFor {
	public static void main(String... args) {
		int i =0, j = 5;
		lab1: for( ; ; i++) {
			for( ; ; --j) {
				System.out.println("j = " + j);
				if(i>j) {
					System.out.println("BREAK");
					break lab1;	
				}
			}
		}
		System.out.println(" i = "+i+", j = "+j);
	}

	//Print i = 0, j = -1
}