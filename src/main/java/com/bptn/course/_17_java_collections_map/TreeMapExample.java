package com.bptn.course._17_java_collections_map;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		
		//declare an object for the TreeMap
				TreeMap<String, Integer> map = new TreeMap<>();
				
				map.put("Toronto", 10000); //population to the city
				map.put("Burlington", 4000);
				map.put("Ottawa", 2000);
				map.put("London", 500);
				map.put("Scorborough", 20000);
			//	map.put(null, 200); // throws NullPointerException
				
				map.put("Brampton", null);
				map.put("Hamilton", null);
				
				map.put("Toronto", 300000);
				
				System.out.println(map);
				
				//Using remove method to remove key-pair value
				map.remove("Burlington");
				
				System.out.println(map);
				
				//Get the first key of the map
				System.out.println("The first key of the map: "+ map.firstKey());
				
				//Get the first entry of the map
				System.out.println("The first entry of the map: "+ map.firstEntry());
				
				//Loop through the map using keySet() method
				for(String key: map.keySet()) {
					
					System.out.println("The key is: "+ key + " the value is: "+ map.get(key));
				}
				
				//subMap() method of TreeMap without using the boolean to include the toKey
				
				System.out.println("The sub map from Brampton to Ottawa excluding Ottawa " + map.subMap("Brampton", "Ottawa"));
				
				//subMap() method of TreeMap by including the boolean to include the toKey
				
				System.out.println("The sub map from Brampton to Ottawa including Ottawa  "+ map.subMap("Brampton", true, "Ottawa", true));
				
				//headMap(K toKey) method
				
				System.out.println("The map strictly less than key london: "+ map.headMap("London"));
				
			}

	}

