package module3_collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Task06_All {
	public static void main(String[] args) {
		// ArrayList
		List<String> arrayList = new ArrayList<>();
		arrayList.add("Rahul");
		arrayList.add("Raina");
		arrayList.add("Yuvraj");
		System.out.println("ArrayList: " + arrayList);

		// LinkedList
		List<String> linkedList = new LinkedList<>();
		linkedList.add("Sachin");
		linkedList.add("Sehwag");
		linkedList.add("Gambhir");
		System.out.println("LinkedList: " + linkedList);

		// HashMap
		Map<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1, "King Kohli");
		hashMap.put(2, "Pant");
		hashMap.put(3, "KL");
		System.out.println("HashMap: " + hashMap);

		// LinkedHashMap
		Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put(1, "Dhoni");
		linkedHashMap.put(2, "Ganguly");
		linkedHashMap.put(3, "Gavaskar");
		System.out.println("LinkedHashMap: " + linkedHashMap);

		// HashSet
		Set<String> hashSet = new HashSet<>();
		hashSet.add("Warner");
		hashSet.add("Gilly");
		hashSet.add("Symonds");
		System.out.println("HashSet: " + hashSet);

		// LinkedHashSet
		Set<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("Zaheer");
		linkedHashSet.add("Morris");
		linkedHashSet.add("Yuzi");
		System.out.println("LinkedHashSet: " + linkedHashSet);

		// TreeSet
		Set<String> treeSet = new TreeSet<>();
		treeSet.add("Jayasurya");
		treeSet.add("Sangakara");
		treeSet.add("Jayawardhane");
		System.out.println("TreeSet: " + treeSet);

		// TreeMap
		Map<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(1, "SRH");
		treeMap.put(3, "CSK");
		treeMap.put(2, "RCB");
		System.out.println("TreeMap: " + treeMap);
	}

}
