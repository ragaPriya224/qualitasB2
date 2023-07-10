package demo.exceptionDemo;

public class ExceptionDemo {

	public static void main(String[] args) {
//		String name = null;
//		name.toLowerCase(); //null pointer exception 
		try {
			System.out.println("hi"); //s1
			int a = 10/0;  //s2
			System.out.println("*************"); //s3
		}catch(NullPointerException e) {
			System.out.println("a");//s4
		}
		System.out.println("bye"); //s5

	}
//s1
}
