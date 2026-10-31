package com.devops.loan.model;

public class Loan {

    private Long id;
    private String customerName;
    private double amount;
    private String status;

    // Default constructor
    public Loan() {
    }

    // Parameterized constructor
    public Loan(Long id, String customerName,
                double amount, String status) {

        this.id = id;
        this.customerName = customerName;
        this.amount = amount;
        this.status = status;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

