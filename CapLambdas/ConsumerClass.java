import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.BiConsumer;

public class ConsumerClass {
		

	public static void main(String... args){

		List<Alumno> list = new ArrayList<>();
		list.add(new Alumno(20, "Juan"));
		list.add(new Alumno(18, "Carlos"));
		list.add(new Alumno(10, "Pedro"));

		Consumer<Alumno> c1 = a -> System.out.println(a);
		Consumer<Alumno> c2 = a -> a.nota = 20;			
		
		System.out.println("===>> Consumer <<===");
		imprimirListado(list, c1);
		imprimirListado(list, c2); 
		

		System.out.println("\n===>> Bi Consumer <<===");
		var map = new HashMap<String, Integer>();
		BiConsumer<String, Integer> bc1 = (k,v) -> map.put(k, v);

		bc1.accept("cod1", 1);
		bc1.accept("cod2", 2);
		bc1.accept("cod3", 3);

		System.out.println(map);

		BiConsumer<String, Double> bc2 = (k, v) -> System.out.println(k + " " + v);
		bc2.accept("Key", 1.5);


	}

	public static void imprimirListado(List<Alumno> alumnos, Consumer<Alumno> consumer){

		for(Alumno a: alumnos){
			consumer.accept(a);
				
		}
	}

}

class Alumno {
	public int nota;
	public String nombre;

	public Alumno(int nota, String nombre){
		this.nota = nota;
		this.nombre = nombre;
	}

	public int getNota(){
		return this.nota;
	}

	public String getNombre(){
		return this.nombre;
	}

	@Override
	public String toString(){
		return this.nombre + "=" + this.nota;	
	}
}