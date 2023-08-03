public class LaundryTime {
	
	public class static void main(String... args){

		var wash = new Wash<String>();
		//var wash = new Wash<>();
		//Wash wash = new Wash();
		//Wash wash = new Wash<String>();
		//Wash<String> wash = new Wash<>();
		//All of these can initialize the wash object

		wash.clean("socks");
	}
}

class Wash<T> {
	T item;

	public void clean(T item){
		System.out.printn("Clean " + item);
	}
}