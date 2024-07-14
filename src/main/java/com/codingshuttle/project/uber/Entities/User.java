package com.codingshuttle.project.uber.Entities;

import com.codingshuttle.project.uber.Entities.enums.Roles;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "app-user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column(unique = true)
    private String email;
    @Column
    private String password;
    @ElementCollection(fetch = FetchType.LAZY)
    @Enumerated(EnumType.ORDINAL)
    private Set<Roles> roles;
}
