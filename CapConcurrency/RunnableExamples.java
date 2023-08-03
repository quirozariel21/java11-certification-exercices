public class RunnableExamples {
	public static void main(String args[]) {

		// Provide a Runnable object or lambda expression to the Thread constructor.
		Runnable task1 = () -> System.out.println("Task");
		Runnable task2 = () -> {return ;};
		Runnable task3 = () -> {};
		Runnable task4 = () -> {int i=10; i++;};


		System.out.println("----------- Ejecuciones de Runnable");
		task1.run();
		task2.run();

		System.out.println("----------- Creando un hilo");
		(new Thread(task1)).start();
		(new MyThread()).start();

		System.out.println("---- END");
	}
}

/*
Create a class that extends Thread and overrides the run() method.
*/
class MyThread extends Thread {
	
	@Override
	public void run() {
		System.out.println("Implementacion de codigo aqui!");
	}
}