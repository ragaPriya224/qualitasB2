package demo.multithreading;

public class ThreadDemo extends Thread{ //created a thread 
	
	@Override
	public void run() { //child thread
		for(int i = 0; i<10;i++) { //child thread
//			Thread.currentThread().setName("child");
			System.out.println("I'm child thread - "+Thread.currentThread().getName());
		}
	}
}
