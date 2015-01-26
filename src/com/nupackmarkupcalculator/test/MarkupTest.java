package com.nupackmarkupcalculator.test;

import org.junit.Test;

import com.nupackmarkupcalculator.lib.Order;

import static org.junit.Assert.assertEquals;

public class MarkupTest {
	/*
	 * Test provided sample input
	 */
    @Test
    public void testSampleInput1() {
        System.out.println("Inside testSampleInput1()");
        Order order = new Order(1299.99, 3, "food");
        assertEquals(1591.58, order.calculateFinalPrice(), 0);
    }
	
	@Test
    public void testSampleInput2() {
        System.out.println("Inside testSampleInput2()");
        Order order = new Order(5432.00, 1, "drugs");
        assertEquals(6199.81, order.calculateFinalPrice(), 0);
    }
	
	@Test
    public void testSampleInput3() {
        System.out.println("Inside testSampleInput3()");
        Order order = new Order(12456.95, 4, "books");
        assertEquals(13707.63, order.calculateFinalPrice(), 0);
    }
}
