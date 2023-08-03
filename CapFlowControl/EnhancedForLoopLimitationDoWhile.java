public class EnhancedForLoopLimitationDoWhile {
	public static void main(String args[]) {
		int[] numbers = {1, 2, 3, 4, 5};

		int count = 10;
		do {
			for(int num: numbers) {
				System.out.println(num);
			}
		} while(count != 10);
	}
}

//In java 11 it works