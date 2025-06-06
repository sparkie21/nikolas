package com.mycompany.th20798;

public class Order {
    private int id;
    private int customerId;
    private int storeId;
    private double totalPrice;
    private String status;

    public Order(int id, int customerId, int storeId, double totalPrice, String status) {
        this.id = id;
        this.customerId = customerId;
        this.storeId = storeId;
        this.totalPrice = totalPrice;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getStoreId() {
        return storeId;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static void createOrder(int customerId, int storeId, double totalPrice, String status) {
        // Implementation for creating an order
    }

    public static void updateOrder(int id, int customerId, int storeId, double totalPrice, String status) {
        // Implementation for updating an order
    }

    public static void deleteOrder(int id) {
        // Implementation for deleting an order
    }
}
