package com.java.programs;

import java.util.HashMap;
import java.util.TreeMap;

public class SortHashMapBasedOnKeys {
	public static void main(String args[]) {

		HashMap<Integer, String> hmap = new HashMap<Integer, String>();

		hmap.put(4, "whandan");
		hmap.put(1, "marco");
		hmap.put(11, "ririn");
		hmap.put(2, "adi");
		hmap.put(33, "prasta");

		System.out.println("Unsort Hashmap");

		for (Integer key : hmap.keySet()) {

			System.out.println("Key is: " + key + " Value is: " + hmap.get(key));
		}

		TreeMap<Integer, String> tmap = new TreeMap<Integer, String>(hmap);

		System.out.println("\n" + "Sort Hashmap");

		for (Integer key : tmap.keySet()) {

			System.out.println("Key is: " + key + " Value is: " + tmap.get(key));
		}

	}

}
