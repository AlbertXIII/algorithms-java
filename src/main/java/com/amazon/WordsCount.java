package com.amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class WordsCount {

	public static void main(String[] args) {
		List<String> words = 
				Arrays.asList(new String[] {"sun","moon","earth","mars","sun","moon","earth","jupiter","saturn"});
		System.out.println(wordsCount(words));

	}
	
	public static List<String> wordsCount(List<String> words){
		
		TreeMap<String, Integer> map = new TreeMap<>();
		for(String word : words) {
			map.put(word, map.getOrDefault(word, 0) + 1);
		}
		for (Map.Entry<String,Integer> entry : map.entrySet()) {
            System.out.println("Key = " + entry.getKey() +
                             ", Value = " + entry.getValue());
		}    
		//sort desc by value / count
		System.out.println("Descending Order by value");
		LinkedHashMap<String, Integer> desc = new LinkedHashMap<>();
		map.entrySet()
			.stream()
			.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
			.forEachOrdered(e -> desc.put(e.getKey(), e.getValue()));
		
		List<String> res = new ArrayList<>();
		for (Map.Entry<String,Integer> entry : desc.entrySet()) {
            System.out.println("Key = " + entry.getKey() +
                             ", Value = " + entry.getValue());
            res.add(entry.getKey() + " " + entry.getValue());
		}
		//sort asc if equal value, but as we used TreeMap, is not necessary
		for(String e : res) {
			System.out.println(e);
		}
		return res;
	}

}
