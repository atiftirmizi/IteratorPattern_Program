package edu.project.foodtypes;

import edu.project.foodtypes.iterator.FoodTypeIterator;
import edu.project.foodtypes.iterator.IteratorContainer;

public class FoodTypesRepository implements IteratorContainer{
	public String[] foodTypes = {"Dessert", "Fast-Food", "Italian", "Mediteranean", "Sea-Food"};
	
	@Override
	public FoodTypeIterator getFoodTypeIterator() {
		return new TypesIterator();
	}

	@Override
	public FoodTypeIterator emptyFoodTypeIterator() {
		TypesIterator iter= null;
		return iter;
	}	
	
	private class TypesIterator implements FoodTypeIterator{
		private int index = 0;
		
		public int getIndex() {
			return this.index;
		}
		@Override
		public int setIndex(int index) {
			// TODO Auto-generated method stub
			this.index = index;
			return index;
		}
		
		@Override
		public boolean hasNext() {
			return (foodTypes[++index] != null) ? true: false;				
		}

		@Override
		public boolean hasPrevious() {
			try {
				return (foodTypes[index--] != null) ? true: false;
			}
			catch(NullPointerException e) {
				System.out.println("You are out of bounds.");
				return false;
			}
			catch(IndexOutOfBoundsException e) {
				System.out.println("You are out of bounds.");
				return false;
			}
		}

		@Override
		public Object next() {
			try {
				String output = foodTypes[this.index];
				return (String) output;
			}catch(NullPointerException e) {
				System.out.println("You are out of bounds.");
				return false;
			}
			catch(IndexOutOfBoundsException e) {
				System.out.println("You are out of bounds.");
				return false;
			}
			
		}

		
		
	}
}
