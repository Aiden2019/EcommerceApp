package com.ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int customerID;
    private String name;
    private List<Product> shoppingCart;

    // Constructor
    public Customer(int customerID, String name) {
        this.customerID = customerID;
        this.name = name;
        this.shoppingCart = new ArrayList<>();
    }

    // Getters and Setters
    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Add a product to the shopping cart
    public void addToCart(Product product) {
        shoppingCart.add(product);
    }

    // Remove a product from the shopping cart
    public void removeFromCart(Product product) {
        shoppingCart.remove(product);
    }

    // Calculate total cost of items in the shopping cart
    public double calculateTotal() {
        double total = 0.0;
        for (Product product : shoppingCart) {
            total += product.getPrice();
        }
        return total;
    }

    // Place an order
    public void placeOrder(com.ecommerce.orders.Order order) {
        order.setCustomer(this);
        order.setProducts(new ArrayList<>(shoppingCart));
        order.setOrderTotal(calculateTotal());
        shoppingCart.clear(); // Empty the cart after placing the order
    }

    // Display shopping cart
    public void displayCart() {
        System.out.println("Shopping Cart for " + name + ":");
        for (Product product : shoppingCart) {
            System.out.println(product);
        }
    }
}
