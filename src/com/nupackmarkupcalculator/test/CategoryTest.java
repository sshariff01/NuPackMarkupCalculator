package com.nupackmarkupcalculator.test;

import org.junit.Test;

import com.nupackmarkupcalculator.lib.MarkupConstants;
import com.nupackmarkupcalculator.lib.Order;

import static org.junit.Assert.assertEquals;

public class CategoryTest {
	/*
	 * Test category assignment
	 */
	@Test
    public void testPharmaceuticalCatgeory() {
        System.out.println("Inside testPharmaceuticalCatgeory()");
        Order order = new Order(5432.00, 1, "drugs");
        assertEquals(MarkupConstants.PHARMACEUTICAL_CATEGORY, order.getCategory());
    }
	
	@Test
    public void testFoodCatgeory() {
        System.out.println("Inside testObjectCatgeory()");
        Order order = new Order(1299.99, 3, "food");
        assertEquals(MarkupConstants.FOOD_CATEGORY, order.getCategory());
    }
	
	@Test
    public void testElectronicsCatgeory() {
        System.out.println("Inside testGetMarkupForElectronics()");
        Order order = new Order(1231.97, 10, "electronics");
        assertEquals(MarkupConstants.ELECTRONICS_CATEGORY, order.getCategory());
    }

	@Test
    public void testOtherCategory() {
        System.out.println("Inside testOtherCategory()");
        Order order = new Order(0.01, 99, "other");
        assertEquals(MarkupConstants.OTHER_CATEGORY, order.getCategory());
    }
}
