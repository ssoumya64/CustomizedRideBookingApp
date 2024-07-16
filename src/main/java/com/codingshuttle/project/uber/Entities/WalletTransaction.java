package com.codingshuttle.project.uber.Entities;


import com.codingshuttle.project.uber.Entities.enums.TransactionMethod;
import com.codingshuttle.project.uber.Entities.enums.TransactionType;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
public class WalletTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private Double amount;

    private TransactionType transactype;
    private TransactionMethod transactionmethod;
    @OneToOne
    private Ride ride;

    private String transactionid;

    @ManyToOne
    private Wallet wallet;
    @CreationTimestamp
    private LocalDateTime timestamp;
}
