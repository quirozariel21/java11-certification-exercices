public class GCStaticVar {

	static Object staticVar;

	public GCStaticVar(Object param) {
		staticVar = param;
	}

	public static void main(String... args) {
		Object tmp = new Object();
		GCStaticVar tc = new GCStaticVar(tmp);

		tmp = new Object();
		tc = null;
		System.gc();
		System.out.println(GCStaticVar.staticVar); //print the address memory of staticVar
	}
}