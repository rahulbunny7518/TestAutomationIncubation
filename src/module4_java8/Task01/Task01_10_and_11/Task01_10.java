package module4_java8.Task01.Task01_10_and_11;

import java.util.Map;
import java.util.TreeMap;

import module4_java8.Task01.Employee;

public class Task01_10 {

	public static void main(String[] args) {
		
		System.out.println("With out Lambda");
		
		TreeMap<Employee1, Integer> treeMap = new TreeMap<>();

        treeMap.put(new Employee1("Abc", 1), 1);
        treeMap.put(new Employee1("Zyx", 2), 2);
        treeMap.put(new Employee1("Fgh", 3), 3);
        treeMap.put(new Employee1("Cde", 4), 4);

        for (Map.Entry<Employee1, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
		
        
        System.out.println();
        
        System.out.println("With Lambda");
		
		TreeMap<Employee2, Integer> treeMap2 = new TreeMap<>((e1, e2) -> e2.getName().compareTo(e1.getName()));

        treeMap2.put(new Employee2("Akhil", 1), 1);
        treeMap2.put(new Employee2("Vinay", 2), 2);
        treeMap2.put(new Employee2("Tarun", 3), 3);
        treeMap2.put(new Employee2("Abhi", 4), 4);

        for (Map.Entry<Employee2, Integer> entry : treeMap2.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

	}

}
