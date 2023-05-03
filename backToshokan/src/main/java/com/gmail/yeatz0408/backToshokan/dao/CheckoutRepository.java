package com.gmail.yeatz0408.backToshokan.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gmail.yeatz0408.backToshokan.entity.Checkout;

public interface CheckoutRepository extends JpaRepository<Checkout, Long> {

    Checkout findByUserEmailAndBookId(String userEmail, Long bookId);
    
    List<Checkout> findBooksByUserEmail(String userEmail);
}
