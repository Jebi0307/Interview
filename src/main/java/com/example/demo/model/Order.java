//package com.example.demo.model;
//
//import jakarta.persistence.*;
//
//import java.time.LocalDateTime;
//import java.util.List;
//
//@Entity
//public class Order {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @OneToMany(mappedBy = "orders")
//    private List<OrderItem> items;
//
//    private Double totalAmount;
//
//    private String status;
//
//    private String customerName;
//
//    private String customerPhone;
//
//    private LocalDateTime createdAt;
//
//    public Order() {
//    }
//
//    public LocalDateTime getCreatedAt() {
//        return createdAt;
//    }
//
//    public void setCreatedAt(LocalDateTime createdAt) {
//        this.createdAt = createdAt;
//    }
//
//    public String getCustomerName() {
//        return customerName;
//    }
//
//    public void setCustomerName(String customerName) {
//        this.customerName = customerName;
//    }
//
//    public String getCustomerPhone() {
//        return customerPhone;
//    }
//
//    public void setCustomerPhone(String customerPhone) {
//        this.customerPhone = customerPhone;
//    }
//
//
//    public String getStatus() {
//        return status;
//    }
//
//    public void setStatus(String status) {
//        this.status = status;
//    }
//
//    public Double getTotalAmount() {
//        return totalAmount;
//    }
//
//    public void setTotalAmount(Double totalAmount) {
//        this.totalAmount = totalAmount;
//    }
//
//
//
//}
