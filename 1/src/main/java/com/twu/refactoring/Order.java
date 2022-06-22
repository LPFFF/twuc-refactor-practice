package com.twu.refactoring;

import java.util.List;

public class Order {

    private static final double TAX_RATE = .10;
    String customerName;
    String address;
    List<LineItem> lineItems;

    public Order(String customerName, String address, List<LineItem> lineItems) {
        this.customerName = customerName;
        this.address = address;
        this.lineItems = lineItems;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerAddress() {
        return address;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    private double totalAmount() {
        return this.lineItems.stream()
                .map(LineItem::lineItemtotalAmount)
                .reduce(0.0, Double::sum);
//        return this.lineItems.stream()
//                .mapToDouble(LineItem::lineItemtotalAmount)
//                .sum();
    }

    public double getTotalTax() {
        return this.totalAmount() * TAX_RATE;
    }

    public double getTotalAmountAndTax() {
        return this.totalAmount() + this.getTotalTax();
    }
}
