package demo;

public class StringDemo {

	public static void main(String[] args) {
		//		char alpha = "java";
		String name = "english chinese japanese german";
		System.out.println(name.length());
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.charAt(2));
		System.out.println(name.indexOf("e"));
		System.out.println(name.indexOf("l"));
		System.out.println(name.lastIndexOf("l"));
		System.out.println(name.concat("hello"));
		//	System.out.println(name.join("h", " "));
		String[] output = name.split("e");
		for (String data : output) 
		{ 
			System.out.println(data);		}
	}

}
