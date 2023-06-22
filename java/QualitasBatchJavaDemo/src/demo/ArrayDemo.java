package demo;

public class ArrayDemo {

	public static void main(String[] args) {
		//single person, single semester
		int mark1 = 80;
		int mark2 = 89;
		int mark3=40;
//		syntax: type []var-name = new type [size];
		int []mark = new int [5];
		// [] -> array symbol
		mark[3] = 40;
		mark[1] = 80;
		mark[0] = 89;
//		mark[2] = "java";
		System.out.println(mark[1]);
//		System.out.println(mark[14]);
		System.out.println(mark.length); 
	}

}
