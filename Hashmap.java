package com.collection;

import java.util.HashMap;
import java.util.Map.Entry;

public class Hashmap {

	public static void main(String[] args) {
		HashMap<String , Integer> obj = new HashMap<>();
		
		obj.put("India", 23);
		obj.put("Australia", 27);
		obj.put("America", 19);
		obj.put("Canada", 10);
		obj.put("Africa", 5);
		
//	System.out.println("List of all country: " +obj);
//	System.out.println("List of all country: " +obj.keySet());
//	System.out.println("List of all country: " +obj.values());
//    System.out.println("country: " +obj.get("Australia"));
//    obj.remove("America");
//    System.out.println("List of all country: " +obj);
    
    obj.replace("Canada", 17);
    System.out.println("List of all country: " +obj);
    
    System.out.print("\nValues: ");
    for (Integer value : obj.values()) {
      System.out.print(value);
      System.out.print(", ");
    }
    System.out.print("\nKey: ");
    for (String key : obj.keySet()) {

        System.out.print(key);

    	System.out.print(", ");
    }
    System.out.print("\nKeyset: ");
    for (Entry<String, Integer> entry :obj.entrySet()) {
      System.out.print(entry);
      System.out.print(", ");
    }
	}
}
