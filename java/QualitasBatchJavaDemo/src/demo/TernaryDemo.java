package demo;
public class TernaryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 10;
		if(age >= 18) {
			System.out.println("u can vote");
		}else {
			System.out.println("u cannot vote");
		}
		String output = (age>=18)?"u can vote":"u cannot vote";
	}

}
