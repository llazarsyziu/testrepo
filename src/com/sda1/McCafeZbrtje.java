package com.sda1;

import java.util.ArrayList;

public class McCafeZbrtje {
    public static void main(String[] args){
        ArrayList<Order> orders = new ArrayList<>();
        orders.add(new Order("Coffee", 3.50));
        orders.add(new Order("Donut", 1.25));
        orders.add(new Order("Sandwich", 5.00));
        double discountRate = 0.10;
        double totalPrice = calculateTotalPrice(orders);
        double discountedPrice = applydiscount(totalPrice, discountRate);
        System.out.println("Total Price: $" + totalPrice);
        System.out.println("Discounted Price: $" + discountedPrice);
    }
    public static double calculateTotalPrice(ArrayList<Order> orders) {
        double total = 0;
        for (Order order : orders) {
            total += order.price;
        }
        return total;
    }
    private static double applydiscount(double totalPrice, double discountRate) {
        return totalPrice * (1 - discountRate);

    }
}
