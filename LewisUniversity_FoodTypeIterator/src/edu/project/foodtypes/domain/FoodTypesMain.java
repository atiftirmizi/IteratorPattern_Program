package edu.project.foodtypes.domain;

import edu.project.foodtypes.FoodTypesRepository;
import edu.project.foodtypes.iterator.FoodTypeIterator;

public class FoodTypesMain {

	public static void main(String[] args) {
		FoodTypesRepository foodTypeRepo = new FoodTypesRepository();
		int index = foodTypeRepo.getFoodTypeIterator().getIndex();
		FoodTypeIterator iterator = foodTypeRepo.getFoodTypeIterator();
		
		for(int i =0; iterator.hasNext(); i++) {
			i = iterator.setIndex(index++);
			String output = (String) iterator.next();
						
			System.out.println(output);
		}
		foodTypeRepo.emptyFoodTypeIterator();
	}

}
