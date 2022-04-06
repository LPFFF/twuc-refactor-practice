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
		StringBuilder output = new StringBuilder();
		output.append(getDescription());
		output.append('\t');
		output.append(getPrice());
		output.append('\t');
		output.append(getQuantity());
		output.append('\t');
		output.append(totalAmount());
		output.append('\n');
		return output.toString();
	}
}
