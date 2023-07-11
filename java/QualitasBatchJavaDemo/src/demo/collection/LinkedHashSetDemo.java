package demo.collection;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet foodSet = new LinkedHashSet();
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
