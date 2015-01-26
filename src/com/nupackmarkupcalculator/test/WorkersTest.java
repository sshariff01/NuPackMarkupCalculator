package com.nupackmarkupcalculator.test;

import org.junit.Test;

import com.nupackmarkupcalculator.lib.Order;

import static org.junit.Assert.assertEquals;

public class WorkersTest {
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
}
