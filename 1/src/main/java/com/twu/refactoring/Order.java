package com.twu.refactoring;

import java.util.List;

public class Order {
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

    double getTotalAmount() {
        double totalAmount = 0d;
        for (LineItem lineItem : getLineItems()) {
            totalAmount += lineItem.getTotalAmount();
        }
        return totalAmount;
    }

    double calculateTotalSalesTax() {
        double totalSalesTax = 0;
        for (LineItem lineItem : getLineItems()) {
            double salesTax = lineItem.getSalesTax();
            totalSalesTax += salesTax;
        }
        return totalSalesTax;
    }

    String getOrderLineItemsInfo() {
        StringBuilder output = new StringBuilder();
        for (LineItem lineItem : getLineItems()) {
            output.append(lineItem.getLineItemInfo());
        }
        return output.toString();
    }

    String getCustomerInfo() {
        return getCustomerName() + getCustomerAddress();
    }
}
