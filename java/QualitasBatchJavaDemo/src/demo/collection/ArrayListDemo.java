package demo.collection;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList foodList = new ArrayList();
		foodList.add("pizza");
		foodList.add("burger");
		foodList.add("pizza");
		foodList.add(4);
		foodList.add(true);
		System.out.println(foodList);
		foodList.remove("burger");
		System.out.println(foodList);
//		foodList.clear();//
		System.out.println(foodList.contains("icecream"));
		System.out.println(foodList);

		foodList.add(2, "puthraikalu");
		System.out.println(foodList);
		foodList.remove(3);
		System.out.println(foodList);//[pizza, pizza, puthraikalu, true]

		foodList.set(1, "cheese");
		System.out.println(foodList);
		
		ArrayList iceCreamList = new ArrayList();
		iceCreamList.add("choc");
		iceCreamList.add("strawberry");

		foodList.addAll(2,iceCreamList);
		System.out.println(foodList);

	}
}
