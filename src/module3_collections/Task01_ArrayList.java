package module3_collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Task01_ArrayList {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		ArrayList<ArrayList<Integer>> totalLists = new ArrayList<>();
		
		for(int i =0; i<n; i++) {
			int lengthOfEachList = scanner.nextInt();
			ArrayList<Integer> currentList = new ArrayList<>();
			for(int j = 0; j<lengthOfEachList; j++) {
				currentList.add(scanner.nextInt());
			}
			totalLists.add(currentList);
		}
		
		ArrayList<String> answer = new ArrayList<>();
		
		int q = scanner.nextInt();
		for(int i = 0; i<q; i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			
			try {
				//System.out.println(totalLists.get(x-1).get(y-1));
				answer.add(totalLists.get(x-1).get(y-1)+"");
			}
			catch (IndexOutOfBoundsException e) {
				//System.out.println("ERROR!");
				answer.add("ERROR!");
			}
		}
		
		answer.forEach( t -> System.out.println(t));
		scanner.close();
 
	}
	

}
