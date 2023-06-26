package demo.oops.ObjectDemo;

public class Car {
	
	public String name;
	public String colour;
	
	Car(){ //no arg constructor
		colour = "black";
	}
	Car(String name, String colour){ // arg constructor
		this.name = name;
		this.colour = colour;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		System.out.println(c.name);//null
		System.out.println(c.colour);
		c.name = "benz";
		System.out.println(c.name);//benz
		
		Car car = new Car();
		car.name = "bmw";
		System.out.println(car.name);//bmw
		System.out.println(car.colour);
		
		Car vehicle = new Car("ferrari","blue");
		System.out.println(vehicle.name);

	}

}
