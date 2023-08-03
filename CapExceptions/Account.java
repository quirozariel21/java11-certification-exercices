public class Account {
	double balance;

	public void withDraw(double amount) throws LowBalanceException {
		try {
			throw new RuntimeException("Not implemented");
		} catch(Exception e) {
			throw new LowBalanceException(e.getMessage());
		}
	}

	public static void main(String... args) {
		try {
			Account ac = new Account();
			ac.withDraw(100.00);
		} catch(Exception e){
			System.out.println(e.getMessage());
		} 
	}
}

class LowBalanceException extends Exception {
	
	public LowBalanceException(String msg) {
		super(msg);
	}

}

class WidthDrawalException extends LowBalanceException {
	public WidthDrawalException(String msg) {
		super(msg);
	}
}

