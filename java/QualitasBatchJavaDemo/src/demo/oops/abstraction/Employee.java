package demo.oops.abstraction;

public abstract class Employee {
	
	public abstract void m1(); //abstract method
	public abstract void m3(); //abstract method

	public String m2() {
		return "hello";
	}

}
// cannot create object for abstract classes 