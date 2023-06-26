package demo.oops.Polymorphism;

public class Child extends Parent{
	public String nickName = "bbb";

	public static void main(String[] args) {

		Child c = new Child();
		c.wealth();
		c.toMarry();
//		String output =c.name;
		c.name = "wealth11";
		String output =c.name;
		System.out.println(c.nickName);
		System.out.println(output);
	}
	//overriding
	@Override
	public void toMarry() {
		super.toMarry();
		System.out.println("b");
		System.out.println(super.nickName);

	}
}
