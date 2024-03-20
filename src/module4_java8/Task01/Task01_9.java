package module4_java8.Task01;

import java.util.Map;
import java.util.TreeMap;

public class Task01_9 {
	public static void main(String[] args) {
		Map<Integer, String> treeMap = new TreeMap<>((a, b) -> b.compareTo(a));
		treeMap.put(01, "abc");
		treeMap.put(02, "def");
		treeMap.put(05, "ghi");
		treeMap.put(04, "jkl");

		for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

	}
}
