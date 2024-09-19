package com.ecommerce.orders;

import com.ecommerce.Product;
import com.ecommerce.Customer;

import java.util.List;

public class Order {
    private int orderID;
    private Customer customer;
    private List<Product> products;
    private double orderTotal;

    // Constructor
    public Order(int orderID) {
        this.orderID = orderID;
    }

    // Getters and Setters
    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public double getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }

    // Generate order summary
    public String generateSummary() {
        StringBuilder summary = new StringBuilder();
        summary.append("Order ID: ").append(orderID).append("\n");
        summary.append("Customer: ").append(customer.getName()).append("\n");
        summary.append("Products:\n");
        for (Product product : products) {
            summary.append(product).append("\n");
        }
        summary.append("Total: $").append(orderTotal);
        return summary.toString();
    }
}
