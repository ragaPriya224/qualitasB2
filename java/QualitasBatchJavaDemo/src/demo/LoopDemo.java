package demo;

public class LoopDemo {

	public static void main(String[] args) {
		System.out.println("888888888888");
		int a = 1;
		int b = 1;
		while(b>5) {
			System.out.println("while");
			b++;
		}
		
		do {
			System.out.println("hello");
			a++;
		}while(a>5);
		
//		for(initialization;condition;incre/dec) {
//			//logic
//		}
		for(int i = 1; i<5;i++) {
			System.out.println("start");
			if(i==3) {
				continue;
			}
			System.out.println("team");
		}
//		break -> break/come out of the loop
//		continue -> skip iteration
	}

}
