public class ControlFlowIf {
	public static void main(String[] args) {
		System.out.println("args:" + args);
		System.out.println("length:" + args.length);
		var hasParams = (args == null ? false : true);
		if(hasParams) {
			System.out.println("has params");
		}{
		    System.out.println("no params");	
		}
	}

	//Print has params and no params
	//Remenber that args array is never null. If the program is
	//run without arguments, ars points to a String array of length 0.
	//Therefore will be true and it will print "has params"

	//Syntactically wrong to have section of code wrapped in {}
}