package com.javapay.javaspringapi.repository;

import com.javapay.javaspringapi.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
