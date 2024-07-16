package com.codingshuttle.project.uber.Entities;

import com.codingshuttle.project.uber.Entities.enums.PaymentMethod;
import com.codingshuttle.project.uber.Entities.enums.PaymentStatus;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentmethod;
    @OneToOne(fetch = FetchType.LAZY)
    private Ride ride;
    private Double amount;
    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentstatus;
    @CreationTimestamp
    private LocalDateTime paymentTime;
}
