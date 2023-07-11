package demo.collection;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap foodMap = new HashMap();
		foodMap.put("burger", 20);
		foodMap.put("pizza", 100);
		foodMap.put("dosa", 55);
		System.out.println(foodMap);
		foodMap.put("pizza", 150);
		System.out.println(foodMap);
		foodMap.containsKey("ice");
		
		
		HashMap cityMap = new HashMap<>();
		cityMap.put(22, "hyderabad");
		//key - > 22
		//value -> hyderbad

		cityMap.put(31, "delhi");
		cityMap.put(22, "secunderabad");
		System.out.println(cityMap);
		System.out.println(cityMap.keySet());
		System.out.println(cityMap.values());
		System.out.println(cityMap.containsKey(101));
		System.out.println(cityMap.containsValue("chennai"));//false
		System.out.println(cityMap.size());
		System.out.println(cityMap.entrySet());
//		//isempty, clear, remove,replace
//		//System.out.println(cityMap.);
		cityMap.putIfAbsent(202, "kolkata");
		System.out.println(cityMap);
	}

}
