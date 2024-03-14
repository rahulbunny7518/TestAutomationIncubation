package module1_OopsConcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Appliance{
	private String nameOfAppliance;
	private int powerConsumptionOfAppliance;
	
	public Appliance(String nameOfAppliance, int powerConsumptionOfAppliance) {
		this.nameOfAppliance = nameOfAppliance;
		this.powerConsumptionOfAppliance = powerConsumptionOfAppliance;
	}
	
	public String getNameOfAppliance() {
		return nameOfAppliance;
	}
	
	public int getPowerConsumptionOfAppliance() {
		return powerConsumptionOfAppliance;
	}
		
}


public class Task4 {
	static int totalPowerConsumption = 0;
	
	static int powerConsumption(List<Appliance> list) {
		
		for(Appliance appliance: list) {
			totalPowerConsumption += appliance.getPowerConsumptionOfAppliance();
		}
		return totalPowerConsumption;
	}
	
	public static void main(String[] args) {
		ArrayList<Appliance> list = new ArrayList<>();
		list.add(new Appliance("FAN", 1));
		list.add(new Appliance("Light", 2));
		list.add(new Appliance("TV", 3));
		list.add(new Appliance("Laptop", 4));
		
		int totalPowerConsumption = powerConsumption(list);
		
		System.out.println("Total Power Consumption :" + totalPowerConsumption);
		
		
		Collections.sort(list, new Comparator<Appliance>() {
			
			@Override
			public int compare(Appliance ob1, Appliance ob2) {
				return ob2.getPowerConsumptionOfAppliance()- ob1.getPowerConsumptionOfAppliance();
			}
		});
		
		for(Appliance appliance:list) {
			System.out.println(appliance.getNameOfAppliance()+" "+appliance.getPowerConsumptionOfAppliance());;
		}
	}
}
