public class InitializestaticVariables {
	//How initialize these static variables?
	static int MAX;
	static final String CLASS_GUID;

	//Option 1
	//static int MAX = 111;
	//static final String CLASS_GUID = "XYZ123";

	//Option 2
	static {
		MAX = 111;
		CLASS_GUID = "XYZ123";
	}

	InitializestaticVariables() {

	}

	InitializestaticVariables(int k) {

	}

	public static void main(String args[]) {

	}
}