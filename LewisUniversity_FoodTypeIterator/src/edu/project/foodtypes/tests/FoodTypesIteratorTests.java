package edu.project.foodtypes.tests;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.project.foodtypes.FoodTypesRepository;
import edu.project.foodtypes.iterator.FoodTypeIterator;

class FoodTypesIteratorTests {

	int index;
	static FoodTypesRepository foodTypeRepo;
	static FoodTypeIterator iterator;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		foodTypeRepo = new FoodTypesRepository();
		iterator = foodTypeRepo.getFoodTypeIterator();
	}


	@BeforeEach
	void setUp() throws Exception {
		index = foodTypeRepo.getFoodTypeIterator().getIndex();
		
	}

	@Test
	void test() {
				
		assertEquals(foodTypeRepo.foodTypes[0], "Dessert");
		assertEquals(foodTypeRepo.foodTypes[1], "Fast-Food");
		assertEquals(foodTypeRepo.foodTypes[2], "Italian");
	}
	@Test
	void testNull() {
		assertNull(foodTypeRepo.emptyFoodTypeIterator());
	}
	
	@Test
	void testIndex() {
		foodTypeRepo.getFoodTypeIterator().setIndex(3);
		assertTrue(foodTypeRepo.getFoodTypeIterator().hasNext());
	}
	


}
