package com.mycompany.th20798;

public class OrderProduct {
    private int orderId;
    private int productId;
    private int quantity;

    public OrderProduct(int orderId, int productId, int quantity) {
        this.orderId = orderId;
        this.productId = productId;
        this.quantity = quantity;
    }

    public int getOrderId() {
        return orderId;
    }

    public int getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static void addOrderProduct(int orderId, int productId, int quantity) {
        System.out.println("Order Product Added: Order ID=" + orderId + ", Product ID=" + productId + ", Quantity=" + quantity);
    }

    public static void updateOrderProduct(int orderId, int productId, int quantity) {
        System.out.println("Order Product Updated: Order ID=" + orderId + ", Product ID=" + productId + ", Quantity=" + quantity);
    }

    public static void deleteOrderProduct(int orderId, int productId) {
        System.out.println("Order Product Deleted: Order ID=" + orderId + ", Product ID=" + productId);
    }
}
