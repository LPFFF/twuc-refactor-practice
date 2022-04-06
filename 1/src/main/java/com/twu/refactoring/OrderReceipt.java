package com.twu.refactoring;

public class OrderReceipt {
    private final Order order;

    public OrderReceipt(Order order) {
        this.order = order;
    }

    public String printReceipt() {
        StringBuilder output = new StringBuilder();

        output.append("======Printing Orders======\n");
        output.append(getCustomerInfo());
        output.append(getOrderLineItemsInfo());
        output.append("Sales Tax").append('\t').append(calculateTotalSalesTax());
        output.append("Total Amount").append('\t').append(getTotalAmount());

        return output.toString();
    }

    private double getTotalAmount() {
        double totalAmount = 0d;
        for (LineItem lineItem : order.getLineItems()) {
            double salesTax = lineItem.totalAmount() * .10;
            totalAmount += lineItem.totalAmount() + salesTax;
        }
        return totalAmount;
    }

    private double calculateTotalSalesTax() {
        double totalSalesTax = 0;
        for (LineItem lineItem : order.getLineItems()) {
            double salesTax = lineItem.totalAmount() * .10;
            totalSalesTax += salesTax;
        }
        return totalSalesTax;
    }

    private String getOrderLineItemsInfo() {
        StringBuilder output = new StringBuilder();
        for (LineItem lineItem : order.getLineItems()) {
            output.append(lineItem.getDescription());
            output.append('\t');
            output.append(lineItem.getPrice());
            output.append('\t');
            output.append(lineItem.getQuantity());
            output.append('\t');
            output.append(lineItem.totalAmount());
            output.append('\n');
        }
        return output.toString();
    }

    private String getCustomerInfo() {
        return order.getCustomerName() + order.getCustomerAddress();
    }
}
