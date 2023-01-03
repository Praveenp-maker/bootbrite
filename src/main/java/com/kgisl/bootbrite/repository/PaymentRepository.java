package com.kgisl.bootbrite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kgisl.bootbrite.model.Payment;
@Repository
public interface PaymentRepository extends JpaRepository<Payment,Integer> {
    
}
