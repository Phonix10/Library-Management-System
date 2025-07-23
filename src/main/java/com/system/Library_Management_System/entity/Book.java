package com.system.Library_Management_System.entity;

import com.system.Library_Management_System.enums.BookType;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "books")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(nullable = false)
    private String tilte;

    @Column(nullable = false)
    private String author;

    @Column(nullable = false)
    private String publisher;
    
    private String genre;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private BookType type;



    
}
