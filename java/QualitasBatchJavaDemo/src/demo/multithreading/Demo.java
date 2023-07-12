package demo.multithreading;

public class Demo {

	public static void main(String[] args) {
		ThreadDemo d = new ThreadDemo(); //main thread
//		d.start();//main thread
		d.run();
		for(int i = 0; i<10;i++) { //main thread
			System.out.println("I'm main thread  - "+ Thread.currentThread().getName());
		}
	}

}
