package com.kodali.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class MapToList {
	
		 float num = 12.34f;
		
	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<>();
		map.put("1", "Java");
		map.put("2", "Spring");
		
		Set<Entry<String,String>> set = map.entrySet();
		
		List<Entry<String,String>> list = new ArrayList<>(set);
		System.out.println(map);
		System.out.println(list);
	}
}
