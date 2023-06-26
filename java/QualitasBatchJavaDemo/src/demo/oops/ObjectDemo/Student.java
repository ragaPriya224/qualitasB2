package demo.oops.ObjectDemo;

public class Student {

	public String name = "abc";
	public static String city = "xyz";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(city);
		Student s = new Student();
		//Student -> class name
		//s -> object name
		//Student() -> constructor
		System.out.println(s.name);
		//int output = s.nameLength();
		//System.out.println(output);
		System.out.println(s.nameLength("hai",100));
		s.addNumber(2, 3);
		s.addNumber(2.5f, 3.5f);


	}
	public void m1() {
		System.out.println("i'm a student ");
	}

	public static void m2() {
		System.out.println("i'm m2 method");
	}
//	n hai
//	count = 100
	public int nameLength(String n,int count) {
		String power ="voice";
//		return  power.length();
		return n.length()+count;
	}
	public int addNumber(int a, int b) {
		return a+b;
	}
	public float addNumber(float a, float  b) {
		return a+b;
	}

}
