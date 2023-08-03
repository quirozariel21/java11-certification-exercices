import java.util.concurrent.*;

import java.util.List;

public class CyclicBarrierExample {


	public static void main(String[] args) throws Exception{

		ExecutorService service = null;
		try {
			service = Executors.newFixedThreadPool(4);
			WorkerManager wm = new WorkerManager();
			var c1 = new CyclicBarrier(4);
			var c2 = new CyclicBarrier(4, () -> System.out.println(""));
			for(int i = 0; i<4; i++) {
				service.submit(() -> wm.realizarTarea(c1, c2));
			}
			System.out.println("End.....");
		} finally {
			if(service != null) {
				service.shutdown();
			}
		}
	}
}

/*
Possible Output
End.....
Recolectar Data
Recolectar Data
Recolectar Data
Recolectar Data
Procesar Data
Procesar Data
Procesar Data
Procesar Data

Imprimir resumen
Imprimir resumen
Imprimir resumen
Imprimir resumen

*/

class WorkerManager {
	private void recolectarData() throws Exception {
		Thread.sleep(5000);
		System.out.println("Recolectar Data");
	}

	private void procesarData() {
		System.out.println("Procesar Data");	
	}


	private void imprimirResumen() {
		System.out.println("Imprimir resumen");	
	}

	protected void realizarTarea(CyclicBarrier c1, CyclicBarrier c2){

		try{

			recolectarData();
			c1.await(); //Sirve para orquestar hilos
			procesarData();
			c2.await();
			imprimirResumen();
		}catch(Exception e) {
			//
		}
		
		
	}
}


