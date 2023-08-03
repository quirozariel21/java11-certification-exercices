public class  Outer {

	private String greeting = "Hi";

	protected class Inner {

		public int repeat = 3;

		public void go() {
			for(var i=0; i < repeat; i++) {
				System.out.println(greeting); // Despite greeting is private it is available
			}
		}
	}

	public void callInner() {
		Inner inner = new Inner();
		inner.go();
	}

	public static void main(String args[]) {
		Outer outer = new Outer();
		outer.callInner();
	}
}