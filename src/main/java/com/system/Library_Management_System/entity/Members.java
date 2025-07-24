package com.system.Library_Management_System.entity;

import com.system.Library_Management_System.enums.MembershipType;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = " memeber")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Members {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false,length = 10)
    private String PhoneNumber; 

    @Column(nullable = false, unique = true)
    private String email;

    private String address;

    @Enumerated(EnumType.STRING)
    private MembershipType membershipType = MembershipType.BASIC;

    private double totalFines;

    







    
}
