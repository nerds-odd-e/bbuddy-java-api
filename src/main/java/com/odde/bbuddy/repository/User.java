package com.odde.bbuddy.repository;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Table(
        uniqueConstraints = @UniqueConstraint(columnNames = {"email"})
)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NonNull
    private String email;

    @NonNull
    private String password;

}
