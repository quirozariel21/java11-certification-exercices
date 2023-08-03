public class LambdaNomenclatura {
	

	public static void main(String... args){
		print(() -> System.out.println("Primera forma de escribir una Lambda\n") );
	}

	public static void print(Template t){
		t.print();
	}

}

interface Template {
	
	void print();

}