package com.nupackmarkupcalculator.lib;

public class Order {
	private double initial_price;
	private String category;
	private Integer num_workers;
	
	public Order(double cost, Integer workers, String category) {
		// Ensure that initial price is rounded to two decimal places
		this.initial_price = (double) Math.round(cost * 100) / 100;
		
		// Ensure that the number of workers is always >= 0
		if (workers < 0) this.num_workers = 0;
		else this.num_workers = workers;
		
		if (category == MarkupConstants.PHARMACEUTICAL_CATEGORY)
			this.category = MarkupConstants.PHARMACEUTICAL_CATEGORY;
		else if (category == MarkupConstants.FOOD_CATEGORY)
			this.category = MarkupConstants.FOOD_CATEGORY;
		else if (category == MarkupConstants.ELECTRONICS_CATEGORY)
			this.category = MarkupConstants.ELECTRONICS_CATEGORY;
		else {
			this.category = MarkupConstants.OTHER_CATEGORY;
		}
		
	}

	public double getInitial_price() {
		return initial_price;
	}

	public void setInitial_price(double initial_price) {
		this.initial_price = initial_price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		if (category == MarkupConstants.PHARMACEUTICAL_CATEGORY)
			this.category = MarkupConstants.PHARMACEUTICAL_CATEGORY;
		else if (category == MarkupConstants.FOOD_CATEGORY)
			this.category = MarkupConstants.FOOD_CATEGORY;
		else if (category == MarkupConstants.ELECTRONICS_CATEGORY)
			this.category = MarkupConstants.ELECTRONICS_CATEGORY;
		else {
			this.category = MarkupConstants.OTHER_CATEGORY;
		}
	}

	public Integer getNum_workers() {
		return num_workers;
	}

	public void setNum_workers(Integer num_workers) {
		if (num_workers < 0) this.num_workers = 0;
		else this.num_workers = num_workers;
	}

	public double getMarkup() {
		if (this.category == MarkupConstants.PHARMACEUTICAL_CATEGORY) {
			return MarkupConstants.PHARMACEUTICAL_MARKUP;
		} else if (this.category == MarkupConstants.FOOD_CATEGORY) {
			return MarkupConstants.FOOD_MARKUP;
		} else if (this.category == MarkupConstants.ELECTRONICS_CATEGORY) {
			return MarkupConstants.ELECTRONICS_MARKUP;
		}

		return MarkupConstants.OTHER_MARKUP;
	}

	public double calculateFinalPrice() {
		double finalPrice = this.initial_price
				* (1 + MarkupConstants.FLAT_MARKUP)
				* (1 + this.getMarkup() + this.num_workers
						* MarkupConstants.LABOUR_MARKUP);
		
		return (double) Math.round(finalPrice * 100) / 100;
	}
}
