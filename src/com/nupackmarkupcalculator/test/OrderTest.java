package com.nupackmarkupcalculator.test;

import org.junit.Test;

import com.nupackmarkupcalculator.lib.MarkupConstants;
import com.nupackmarkupcalculator.lib.Order;

import static org.junit.Assert.assertEquals;

public class OrderTest {
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
	
	/*
	 * Test number of workers assignment
	 */
	@Test
    public void testNumWorkers() {
        System.out.println("Inside testPharmaceuticalCatgeory()");
        Order order = new Order(5432.00, 1, "drugs");
        assertEquals(1, order.getNum_workers(), 0);
    }
	
	@Test
    public void testNegativeNumWorkers() {
        System.out.println("Inside testNegativeNumWorkers()");
        Order order = new Order(5432.00, -1, "drugs");
        assertEquals(0, order.getNum_workers(), 0);
    }
	
	@Test
    public void testMaxIntNumWorkers() {
        System.out.println("Inside testMaxIntNumWorkers()");
        Order order = new Order(0.01, Integer.MAX_VALUE, "other");
        assertEquals(Integer.MAX_VALUE, order.getNum_workers(), 0);
    }
	
	@Test
    public void testGreaterThanMaxPositiveNumWorkers() {
        System.out.println("Inside testGreaterThanMaxPositiveNumWorkers()");
        Order order = new Order(0.01, Integer.MAX_VALUE+1, "other");
        assertEquals(0, order.getNum_workers(), 0);
    }
	
	@Test
    public void testLargeNegativeNumWorkers() {
        System.out.println("Inside testMinIntNumWorkers()");
        Order order = new Order(0.01, Integer.MIN_VALUE, "other");
        assertEquals(0, order.getNum_workers(), 0);
    }
	
	/*
	 * Test initial price with more than 2 decimal points
	 */
	@Test
    public void testLongDoubleInitPrice() {
        System.out.println("Inside testLongDoubleInitPrice()");
        Order order = new Order(29.92123922, 2, "food");
        assertEquals(29.92, order.getInitial_price(), 0);
    }
	
	@Test
    public void testSuperLongDoubleInitPrice() {
        System.out.println("Inside testLongDoubleInitPrice()");
        // A double-type variable has a maximum of 16 decimal digits
        Order order = new Order(99.12345678901234567, 2, "food");
        assertEquals(99.12, order.getInitial_price(), 0);
    }
}
