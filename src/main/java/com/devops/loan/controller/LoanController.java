package com.devops.loan.controller;

import com.devops.loan.model.Loan;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/loans")
public class LoanController {

    // Get all loans
    @GetMapping
    public List<Loan> getLoans() {

        return Arrays.asList(
            new Loan(1L, "Kavya", 500000, "APPROVED"),
            new Loan(2L, "Rahul", 300000, "PENDING"),
            new Loan(3L, "Priya", 700000, "REJECTED")
        );
    }

    // Health check
    @GetMapping("/health")
    public String health() {

        return "Loan Management Application is running!";
    }

    // Get loan by ID
    @GetMapping("/{id}")
    public Loan getLoan(@PathVariable Long id) {

        return new Loan(id, "Customer", 250000, "PENDING");
    }
}

