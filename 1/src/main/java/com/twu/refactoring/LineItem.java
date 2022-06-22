package com.twu.refactoring;

public class LineItem {
	private String description;
	private double price;
	private int quantity;

	public LineItem(String description, double price, int quantiyt) {
		super();
		this.description = description;
		this.price = price;
		this.quantity = quantiyt;
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

    public double lineItemtotalAmount() {
        return price * quantity;
    }

	public StringBuilder lineItemInfo() {
		StringBuilder lineItemInfo = new StringBuilder();
		lineItemInfo.append(getDescription());
		lineItemInfo.append('\t');
		lineItemInfo.append(getPrice());
		lineItemInfo.append('\t');
		lineItemInfo.append(getQuantity());
		lineItemInfo.append('\t');
		lineItemInfo.append(lineItemtotalAmount());
		lineItemInfo.append('\n');
		return lineItemInfo;
	}
}