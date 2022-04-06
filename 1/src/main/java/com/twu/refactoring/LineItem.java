package com.twu.refactoring;

public class LineItem {
	private String description;
	private double price;
	private int quantity;

	public LineItem(String description, double price, int quantity) {
		super();
		this.description = description;
		this.price = price;
		this.quantity = quantity;
	}

	public String getDescription() {
		return description;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

    double totalAmount() {
        return price * quantity;
    }

	double getSalesTax() {
		return totalAmount() * .10;
	}

	double getTotalAmount() {
		return totalAmount() + getSalesTax();
	}

	String getLineItemInfo() {
		return getDescription() +
			'\t' +
			getPrice() +
			'\t' +
			getQuantity() +
			'\t' +
			totalAmount() +
			'\n';
	}
}
