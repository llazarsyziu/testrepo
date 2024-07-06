package com.sda1;

import java.util.ArrayList;
class Order {
    String itemName;
    double price;

    Order(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
    }
    @Override
    public String toString() {
        return itemName + ": $" + price;
    }
}
public class McCafePrice {
    public static void main(String[] args){
        ArrayList<Order> orders = new ArrayList<>();
        orders.add(new Order("Coffee", 3.50));
        orders.add(new Order("Donut", 1.25));
        orders.add(new Order("Sandwich", 5.00));
        double totalPrice = calculateTotalPrice(orders);
        System.out.println("Total Price: $" + totalPrice);
    }
    public static double calculateTotalPrice(ArrayList<Order> orders){
        double total = 0;
        for (Order order : orders){
            total += order.price;
        }
        return total;
    }
}
