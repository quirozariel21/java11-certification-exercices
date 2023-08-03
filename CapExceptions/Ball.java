class LostBallException extends Exception {
	
}

public class Ball {


	public void toss() throw LostBallException { // DOES NOT COMPILE cause instead of throw should be thorws
		var windUp = new int[0];
		System.out.println(windUp[0]);
	}

	public static void main(String[] args) {
		try {
			new Ball().toss();
		} catch(Throwable e) {
			System.out.println("Caught!");
		}
	}

}