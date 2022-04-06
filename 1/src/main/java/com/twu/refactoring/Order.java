package com.twu.refactoring;

import java.util.List;
import java.util.stream.Collectors;

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
        return getLineItems().stream()
            .mapToDouble(LineItem::getTotalAmount)
            .sum();
    }

    double calculateTotalSalesTax() {
        return getLineItems().stream()
            .mapToDouble(LineItem::getSalesTax)
            .sum();
    }

    String getOrderLineItemsInfo() {
        return getLineItems().stream()
            .map(LineItem::getLineItemInfo)
            .collect(Collectors.joining());
    }

    String getCustomerInfo() {
        return getCustomerName() + getCustomerAddress();
    }
}
