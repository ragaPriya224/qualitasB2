package demo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class GenericDemo {

	public static void main(String[] args) {
		int marks[] = new int[5];
		marks[4] = 5;
		marks[2] = "A";
		
		TreeSet<Integer> foodSet = new TreeSet<Integer>();
		foodSet.add(8);
		foodSet.add(99);
//		foodSet.add("hello");
		
		ArrayList<String> foodList = new ArrayList<String>();
		foodList.add("pizza");
		foodList.add("burger");
		foodList.add("pizza");
		
		HashMap<String,Integer> foodMap = new HashMap();
		foodMap.put("burger", 20);
		foodMap.put("pizza", 100);
	}

}
