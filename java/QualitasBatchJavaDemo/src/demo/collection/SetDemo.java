package demo.collection;

import java.util.HashSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet foodSet = new HashSet();
		foodSet.add("pizza");
		foodSet.add("burger");
		foodSet.add("cheese");
		foodSet.add("Annam");
		foodSet.add("pizza");
		foodSet.add(4);
		foodSet.add(true);
		System.out.println(foodSet);
		
	}

}
