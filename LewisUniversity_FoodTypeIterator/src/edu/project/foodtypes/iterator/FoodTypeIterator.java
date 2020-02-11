package edu.project.foodtypes.iterator;

public interface FoodTypeIterator {
	public boolean hasNext();
	public boolean hasPrevious();
	public Object next();
	public int getIndex();
	public int setIndex(int index);
}
