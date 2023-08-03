public class LocalClassPrintNumbers {
	private int length = 5;
	public void calculate() {
		final int width = 20;

		class MyLocalClass {
			public void multiply() {
				System.out.println(length * width);
			}
		}

		MyLocalClass local = new MyLocalClass();
		local.multiply();
	}

	public void processData() {
		final int size = 5;
		int width = 10; // effectively final the first tie
		int height = 2; // // effectively final the first time

		class VolumeCalculator {
			public int multiply() {
				return size * width * height; // DOES NOT COMPILE
			}
		}

		//It is reassigned during the method so it cannot be effectively final.
		// For this reason, the local class declaration does not compile.
		width = 2;
	}

	public static void main(String... args) {
		LocalClassPrintNumbers outer = new LocalClassPrintNumbers();
		outer.calculate();
	}
}