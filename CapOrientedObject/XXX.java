public class YYY extends XXX {
	
	public void m() {}

	public static void main(String args[]) {
			YYY obj = new YYY(); //COMPILE
			/// XXX instance cannot be because this will need
			// to put the exception next to the name of the metod --> throws
			obj.m();
	}
}

class XXX {
	public void m() throws Exception {
	  throw new Exception();
	}
}