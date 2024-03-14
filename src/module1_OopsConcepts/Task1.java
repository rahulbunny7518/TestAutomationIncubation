package module1_OopsConcepts;

import java.util.Scanner;

interface Pizza{
	int costOfBase(String inputBase);
	int costOfToppings(String arr[]);
}

class PizzaCostCalculator implements Pizza{
	int cost=0; 
	public int costOfBase(String inputBase) {
		if(inputBase.equalsIgnoreCase("standard")) {
			cost=cost+50;
		}
		else if(inputBase.equalsIgnoreCase("soft")) {
			cost=cost+100;
		}
		
		return cost;
	}
	
	public int costOfToppings(String arr[]) {
		
		for(int i =0; i<arr.length; i++) {
			if(arr[i].equalsIgnoreCase("Tomato")) {
				cost=cost+60;
			}
			else if(arr[i].equalsIgnoreCase("corn")) {
				cost=cost+70;
			}
			else if(arr[i].equalsIgnoreCase("mushroom")) {
				cost=cost+80;
			}
		}
		
		return cost;
	}
}

public class Task1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Base : standard or soft");
		String base = scanner.next();
		
		System.out.println("Enter number of Toppings and Enter Toppings as space seperated in an array ");
		int numberOfToppings=scanner.nextInt();
		String array[] = new String[numberOfToppings];
		for(int i=0; i<array.length; i++) {
			array[i]=scanner.next();
		}
		
		PizzaCostCalculator pizzaCostCalculator = new PizzaCostCalculator();
		
		int baseCost = pizzaCostCalculator.costOfBase(base);
		pizzaCostCalculator.cost=0;
		int toppingsCost = pizzaCostCalculator.costOfToppings(array);
		
		
		System.out.println("Cost of Pizza :" + (baseCost+toppingsCost));
		
		scanner.close();
	}
}