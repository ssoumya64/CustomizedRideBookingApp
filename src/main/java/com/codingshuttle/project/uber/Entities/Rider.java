package com.codingshuttle.project.uber.Entities;

import jakarta.persistence.*;

@Entity
public class Rider {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
    private Double ratings;
}
