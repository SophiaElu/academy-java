package com.bptn.course._17_java_collections_map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		
Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
		
		linkedHashMap.put("Jane", 24);
		linkedHashMap.put("Angie", 24);
		linkedHashMap.put("Steve", 26);
		linkedHashMap.put("Sweytha", 50);
		linkedHashMap.put(null, 55);
		linkedHashMap.put("Sarah", null);
		linkedHashMap.put("Johnson", null);
		linkedHashMap.put("Sweytha", 60);
		
		
		
		System.out.println(linkedHashMap);
		
		//Access the value in LinkedHashMap
		System.out.println("Jane's age is "+ linkedHashMap.get("Jane"));
		
		//Loop over the LinkedHashMap using entrySet() method
		for(Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
			
			System.out.println("Name: "+ entry.getKey() + " Age: "+ entry.getValue());
		}
		
		
		System.out.println("Looping over using iterator");
		
		//Access the map using iterator
		Iterator<Map.Entry<String, Integer>> it= linkedHashMap.entrySet().iterator();
		
		while(it.hasNext()) {
			
			Map.Entry<String, Integer> entry= it.next();
			
			System.out.println("Name: "+ entry.getKey() + " Age: "+ entry.getValue());
			
		}
		
		

	}

	}

