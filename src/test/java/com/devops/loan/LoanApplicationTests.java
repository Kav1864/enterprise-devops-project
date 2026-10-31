package com.devops.loan;

import com.devops.loan.controller.LoanController;
import com.devops.loan.model.Loan;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class LoanApplicationTests {

    @Autowired
    private LoanController loanController;

    @Test
    void contextLoads() {
        assertNotNull(loanController);
    }

    @Test
    void shouldReturnAllLoans() {

        List<Loan> loans = loanController.getLoans();

        assertEquals(3, loans.size());
    }

    @Test
    void shouldReturnHealthMessage() {

        String response = loanController.health();

        assertEquals(
            "Loan Management Application is running!",
            response
        );
    }

    @Test
    void shouldReturnLoanById() {

        Loan loan = loanController.getLoan(1L);

        assertEquals(1L, loan.getId());
        assertEquals("Customer", loan.getCustomerName());
    }
}

