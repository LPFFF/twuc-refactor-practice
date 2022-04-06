package com.twu.refactoring;

public class OrderReceipt {
    private final Order order;

    public OrderReceipt(Order order) {
        this.order = order;
    }

    public String printReceipt() {
        StringBuilder output = new StringBuilder();

        output.append("======Printing Orders======\n");
        output.append(order.getCustomerInfo());
        output.append(order.getOrderLineItemsInfo());
        output.append("Sales Tax").append('\t').append(order.calculateTotalSalesTax());
        output.append("Total Amount").append('\t').append(order.getTotalAmount());

        return output.toString();
    }
}
