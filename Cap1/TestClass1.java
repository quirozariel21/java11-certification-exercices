public class TestClass1 {
	
	// This class DOES NOT COMPILE, because it gives error in the line 17
	static String[] arr = {"lunes","martes","miercoles"};

	public static  void main(String args[]) {
		
		var index = 0;
		for(var value: arr) {
			System.out.println("value=" + value);
			if(index == 3) {
				break;
			} else {
				continue;
			}
			
			if (arr[index].length() > 3) { // error: unreacheable statement

			}
			index++;

		}
		System.out.println(arr[index]);
	}
}