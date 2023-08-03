public class DoWhileExercice {
	public static void main(String args[]) {
		var gas = true;
		do {
			System.out.println("helium");
			gas = gas ^ gas;
			System.out.println(gas);
			gas = !gas;
		} while(!gas);
	}
}