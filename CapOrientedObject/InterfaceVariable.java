public class InterfaceVariable implements IInt {
	
	public static void main(String[] args) {
		InterfaceVariable s = new InterfaceVariable();
		int j = s.thevalue;
		int k = IInt.thevalue;
		int l = thevalue; // if you put this.thevalue then it will fail
		//This will compile and run without any problem.
		System.out.println("j = " + j + ", k = " + k + ", l = " + l + ", thevalue = " + thevalue);
	}
	
}

public interface IInt {
	// By default this variable is public static final	
	int thevalue = 9;
}