package module1_OopsConcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

abstract class Sweet{
	String name;
	double weight;
	
	public Sweet(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}
	
	abstract double getSweetWeight();
}


class Chocolate extends Sweet{
	String type;
	public Chocolate(String name, double weight, String type) {
		super(name,weight);
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
	@Override
	public double getSweetWeight() {
		return weight;
	}	
}

class Candy extends Sweet{
	String flavour;
	
	public Candy(String name, double weight, String flavour) {
		super(name, weight);
		this.flavour = flavour;
	}
	
	public String getFlavour() {
		return flavour;
	}
	
	@Override
	public double getSweetWeight() {
		return weight;
	}
}

class Gift{
	private List<Sweet> sweets = new ArrayList<>();
	
	public void addSweet(Sweet sweet) {
		sweets.add(sweet);
	}
	
	public double calculateTotalWeight() {
		double totalWeight = 0;
		for(Sweet sweet: sweets) {
			totalWeight+= sweet.getSweetWeight();
		}
		return totalWeight;
	}
	
	
	public void sortChocolatesByType() {
        sweets.sort(Comparator.comparing(sweet -> ((Chocolate) sweet).getType()));
    }
	
	public List<Sweet> findCandiesInRange(double minWeight, double maxWeight){
		List<Sweet> candiesInRange = new ArrayList<>();
		
		for(Sweet sweet: sweets) {
			if((sweet instanceof Candy) && (sweet.weight>= minWeight && sweet.weight<= maxWeight)) {
				candiesInRange.add(sweet);
			}
		}
		return candiesInRange;
	}
	
	 public List<Sweet> getSweets() {
		 return sweets;
	 }
}



public class Task3 {

	public static void main(String[] args) {
		
		Gift gift = new Gift();
		gift.addSweet(new Chocolate("Dairy Milk", 60, "Milk Choclate"));
		gift.addSweet(new Chocolate("KitKat", 45, "Wafer Chocolate"));
        gift.addSweet(new Candy("Gummy Bears", 30, "Mixed Fruit"));
		gift.addSweet(new Candy("Lollipop", 20, "Strawberry"));
		
		double totalWeight = gift.calculateTotalWeight();
        System.out.println("Total weight of the gift: " + totalWeight + " grams");
        
        System.out.println();
        
        
        System.out.println("Chocolates sorted by type:");
      
        List<Chocolate> chocolateList = new ArrayList<>();
        for (Sweet sweet : gift.getSweets()) {
            if (sweet instanceof Chocolate) {
                Chocolate chocolate = (Chocolate) sweet;
                chocolateList.add(chocolate);
            }
        }  
        Collections.sort(chocolateList, new Comparator<Chocolate>() {
        	
        	public int compare(Chocolate ob1, Chocolate ob2) {
        		return ob1.getType().compareTo(ob2.getType());
        	}
        });
        
              
        chocolateList.forEach(t -> System.out.println( t.name + ""+ t.type+ " "+ t.weight));
        
        
        System.out.println();
        
        double minWeight = 20;
        double maxWeight = 35;
        List<Sweet> candiesInRange = gift.findCandiesInRange(minWeight, maxWeight);
        System.out.println("Candies within the range of " + minWeight + " to " + maxWeight + " grams:");
        for (Sweet sweet : candiesInRange) {
            if (sweet instanceof Candy) {
                Candy candy = (Candy) sweet;
                System.out.println(candy.name + " - " + candy.getFlavour());
            }
        }
		
		
	}

}
